package com.codemakerlab.ktlearnfromnewbie.data.repository

import androidx.lifecycle.LiveData
import com.codemakerlab.ktlearnfromnewbie.data.api.TodoDao
import com.codemakerlab.ktlearnfromnewbie.data.model.Todo

class TodoRepository(private val dao: TodoDao) {
    val todos: LiveData<List<Todo>> = dao.getTodos()

    suspend fun create(todo: Todo) = dao.createTodo(todo)

    suspend fun delete(todo: Todo) = dao.deleteTodo(todo)

    suspend fun update(todo: Todo) {
        return dao.updateTodo(todo)
    }
}