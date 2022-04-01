package com.riyazuddin.databinding.viewmodels

import androidx.lifecycle.ViewModel
import com.riyazuddin.databinding.model.User

class MainViewModel: ViewModel() {

    private var user: User = User("Riyaz", "Student", 515)
    fun getUser() = user

    private val includeLayoutText = "Included Layout"
    fun getIncludedLayoutText() = includeLayoutText
}