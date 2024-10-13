package com.example.woof.ui

import androidx.lifecycle.ViewModel
import com.example.woof.data.Dog
import com.example.woof.data.dogs
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class WoofViewModel : ViewModel() {
    // Use a Map to store expanded state for each dog by its ID (name assumed to be unique here)
    private val _expandedStates = MutableStateFlow(dogs.map { DogUiState(dog = it) })
    val expandedStates: StateFlow<List<DogUiState>> = _expandedStates.asStateFlow()

    // Toggle the expanded state for a specific dog
    fun toggleExpanded(dog: Dog) {
        _expandedStates.value = _expandedStates.value.map { dogUiState ->
            if (dogUiState.dog == dog) dogUiState.copy(isExpanded = !dogUiState.isExpanded)
            else dogUiState
        }
    }
}