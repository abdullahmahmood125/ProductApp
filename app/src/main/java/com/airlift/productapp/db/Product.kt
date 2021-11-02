package com.airlift.productapp.db

data class Product(
    val id: Int,
    val title: String,
    val price: String,
    val description: String,
    val category: String,
    val image: String,
    val rating: rating

)

data class rating(
    val rate: Float,
    val count: Int
)