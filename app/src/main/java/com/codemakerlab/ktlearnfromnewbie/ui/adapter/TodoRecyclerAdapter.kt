package com.codemakerlab.ktlearnfromnewbie.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codemakerlab.ktlearnfromnewbie.R
import com.codemakerlab.ktlearnfromnewbie.databinding.TodoRowItemBinding
import com.codemakerlab.ktlearnfromnewbie.data.model.Todo

class TodoRecyclerAdapter : RecyclerView.Adapter<TodoRecyclerAdapter.TodoViewHolder>() {
    private lateinit var mViewBinding: TodoRowItemBinding
    private var todoList: MutableList<Todo>  = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.todo_row_item,
            parent,
            false
        )

        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val currentTodoItem = todoList[position]
        holder.bind(currentTodoItem)
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

    fun setData(todoList: MutableList<Todo>){
        this.todoList = todoList
    }

    inner class TodoViewHolder(private val itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(todo: Todo) {
            mViewBinding.tvTitle.text = todo.title
            mViewBinding.tvTime.text = todo.time
            mViewBinding.chkIsCompleted.isChecked = todo.isCompleted
        }
    }
}