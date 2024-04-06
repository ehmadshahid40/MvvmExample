package com.example.mvvmexample

import androidx.lifecycle.ViewModel

class ItemViewModel : ViewModel() {
    private val itemList = mutableListOf<Item>()

    init {
        // Initialize some sample data
        for (i in 1..100) {
            itemList.add(Item("Item $i"))
        }
    }

    fun getItems(): List<Item> {
        return itemList
    }
}