package com.example.dwight_mobile

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dwight_mobile.entities.Task
import com.example.dwight_mobile.network.DwightApi
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel constructor(private val api: DwightApi) : ViewModel() {
    sealed class Result {
        data class Success(
            val tasks: List<Task>
        ) : Result()

        object Failure : Result()
    }

    val taskList = MutableLiveData<List<Task>>()
    val errorMessage = MutableLiveData<String>()

    suspend fun getAllTasks() : Result {
        return withContext(Dispatchers.IO) {
            try {
                val response: Response<List<Task>> = api.getAllTasks()
                if (response.isSuccessful) {
                    return@withContext Result.Success(response.body()!!)
                } else {
                    return@withContext Result.Failure
                }
            } catch(t: Throwable) {
                if (t !is CancellationException) {
                    return@withContext Result.Failure
                } else {
                    throw t
                }
            }
        }
    }
}