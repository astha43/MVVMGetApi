package com.example.mvvmnewapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmnewapp.repository.MainRepository
import java.lang.IllegalArgumentException

class MainViewModelFactory constructor(private val repository: MainRepository) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MainViewModel::class.java)){
                MainViewModel(this.repository) as T
        }else{
            throw IllegalArgumentException("View Model Not Fount")
        }
    }
}