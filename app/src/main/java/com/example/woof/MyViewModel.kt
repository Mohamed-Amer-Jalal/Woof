package com.example.woof

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State

class MyViewModel : ViewModel() {
    // State to track if expanded or not
    private val _expanded = mutableStateOf(false)
    val expanded: State<Boolean> = _expanded

    // Function to toggle the expanded state
    fun toggleExpanded() {
        _expanded.value = !_expanded.value
    }
}