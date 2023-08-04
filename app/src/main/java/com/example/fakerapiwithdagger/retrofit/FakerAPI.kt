package com.example.fakerapiwithdagger.retrofit

import com.example.fakerapiwithdagger.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("products")
    suspend fun getProducts() : Response<List<Product>>
}