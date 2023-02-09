package com.example.ecommerceapp.data

data class Order(
    val orderStatus: String,
    val totalPrice: Float,
    val products: List<CartProduct>,
    val address: Address
)
