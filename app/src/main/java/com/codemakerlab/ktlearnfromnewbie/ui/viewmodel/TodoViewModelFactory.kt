package com.codemakerlab.ktlearnfromnewbie.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.codemakerlab.ktlearnfromnewbie.data.repository.TodoRepository
import java.lang.IllegalArgumentException

class TodoViewModelFactory(
    private val repository: TodoRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(TodoViewModel::class.java)) {
            return TodoViewModel(repository) as T
        }

        throw IllegalArgumentException("Unknown view model class")
    }
}