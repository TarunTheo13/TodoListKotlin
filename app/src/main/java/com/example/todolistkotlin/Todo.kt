package com.example.todolistkotlin

data class Todo(
    val title: String,
    val isChecked: Boolean = false
)