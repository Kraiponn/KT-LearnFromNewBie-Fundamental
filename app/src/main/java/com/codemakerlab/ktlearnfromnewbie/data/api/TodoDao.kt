package com.codemakerlab.ktlearnfromnewbie.data.api

import androidx.lifecycle.LiveData
import androidx.room.*
import com.codemakerlab.ktlearnfromnewbie.data.model.Todo

@Dao
interface TodoDao {
    @Insert
    suspend fun createTodo(todo: Todo)

    @Query("SELECT * FROM todo_table")
    fun getTodos(): LiveData<List<Todo>>

    @Update
    suspend fun updateTodo(todo: Todo)

    @Delete
    suspend fun deleteTodo(todo: Todo)
}