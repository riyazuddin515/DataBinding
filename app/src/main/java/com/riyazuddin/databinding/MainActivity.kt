package com.riyazuddin.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import com.riyazuddin.databinding.databinding.MainActivityBinding
import com.riyazuddin.databinding.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.text = "Hello World!"
        binding.dataBindingDemo = "Data Binding Demo"
        binding.viewModel = viewModel
    }
}