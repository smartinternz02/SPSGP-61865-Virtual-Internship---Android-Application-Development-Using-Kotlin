package com.jaykanjia.grocerylistapp.ui

import androidx.lifecycle.ViewModel
import com.jaykanjia.grocerylistapp.database.GroceryRepository
import androidx.lifecycle.ViewModelProvider

class GroceryViewModelFactory(private val repository: GroceryRepository):ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return GroceryViewModel(repository) as T
    }
}