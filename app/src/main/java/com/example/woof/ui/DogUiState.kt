package com.example.woof.ui

import com.example.woof.data.Dog

data class DogUiState(
    val dog: Dog,
    val isExpanded: Boolean = false
)
