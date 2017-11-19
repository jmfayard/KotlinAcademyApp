package com.marcinmoskala.kotlinacademy.data

data class News(
        val id: Int? = null, // Null when proposition
        val title: String,
        val subtitle: String,
        val imageUrl: String,
        val url: String?
)