package com.example.finalproject2.model

class ApiResponse(
    var status: String,
    var totalResults: Int,
    var articles: List<Article>
)