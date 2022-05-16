package com.example.dwight_mobile.network

import com.example.dwight_mobile.entities.Task
import retrofit2.Response
import retrofit2.http.*

interface DwightApi {
    @GET("/tasks")
    suspend fun getAllTasks(): Response<List<Task>>

    @GET("/tasks/{id}")
    suspend fun getTask(@Path("id") id: Int): Response<Task>

    @POST("/tasks")
    suspend fun postTask(@Body requestBody: Task): Response<Task>

    @PUT("/tasks/{id}")
    suspend fun putTask(@Path("id") id: Int, @Body requestBody: Task): Response<Task>

    @DELETE("/tasks/{id}")
    suspend fun deleteTask(@Path("id") id: Int): Response<Task>
}