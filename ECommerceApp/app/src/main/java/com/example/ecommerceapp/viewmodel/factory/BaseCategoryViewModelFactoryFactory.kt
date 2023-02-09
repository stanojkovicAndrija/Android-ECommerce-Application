package com.example.ecommerceapp.viewmodel.factory

import androidx.lifecycle.ViewModelProvider
import com.example.ecommerceapp.data.Category
import com.google.firebase.firestore.FirebaseFirestore
import androidx.lifecycle.ViewModel
import com.example.ecommerceapp.viewmodel.CategoryViewModel

class BaseCategoryViewModelFactoryFactory(
    private val firestore: FirebaseFirestore,
    private val category: Category
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CategoryViewModel(firestore, category) as T
    }

}