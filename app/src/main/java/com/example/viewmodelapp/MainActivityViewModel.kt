package com.example.viewmodelapp

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = 0

    fun getCurrentCount(): Int {
        return count
    }

    fun getUpdatedcount(): Int {
        return ++count
    }
}