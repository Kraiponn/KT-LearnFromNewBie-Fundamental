package com.codemakerlab.ktlearnfromnewbie.service

import androidx.lifecycle.LiveData
import com.codemakerlab.ktlearnfromnewbie.dao.TodoDao
import com.codemakerlab.ktlearnfromnewbie.model.Todo

class TodoRepository(private val dao: TodoDao) {
    val todos: LiveData<List<Todo>> = dao.getTodos()

    suspend fun create(todo: Todo) = dao.createTodo(todo)

    suspend fun delete(todo: Todo) = dao.deleteTodo(todo)

    suspend fun update(todo: Todo) {
        return dao.updateTodo(todo)
    }
}