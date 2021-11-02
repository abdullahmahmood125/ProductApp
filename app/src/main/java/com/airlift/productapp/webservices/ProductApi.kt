package com.airlift.productapp.webservices

import com.airlift.productapp.db.Product
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductApi {

    @GET("https://fakestoreapi.com/products")
    suspend fun getProducts(@Path("user") userId: String): Product
}