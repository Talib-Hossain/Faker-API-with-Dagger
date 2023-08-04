package com.example.fakerapiwithdagger.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fakerapiwithdagger.models.Product
import com.example.fakerapiwithdagger.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: ProductRepository) : ViewModel() {
    val productsLiveData: LiveData<List<Product>>
        get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }
}