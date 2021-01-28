package com.codemakerlab.ktlearnfromnewbie.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codemakerlab.ktlearnfromnewbie.data.model.Todo
import com.codemakerlab.ktlearnfromnewbie.data.repository.TodoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TodoViewModel(private val repository: TodoRepository) : ViewModel() {
    val todoLiveData: LiveData<List<Todo>> = repository.todos

    fun created(todo: Todo) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.create(todo)
        }
    }

    fun remove(todo: Todo) {
        viewModelScope.launch(Dispatchers.IO){
            repository.delete(todo)
        }
    }

    fun updated(todo: Todo) {
        viewModelScope.launch(Dispatchers.IO){
            repository.update(todo)
        }
    }
}