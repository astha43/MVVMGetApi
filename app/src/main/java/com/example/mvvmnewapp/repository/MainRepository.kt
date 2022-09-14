package com.example.mvvmnewapp.repository

import com.example.mvvmnewapp.api.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllMovies() = retrofitService.getAllMovies()
}