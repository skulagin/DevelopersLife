package com.stopkaaaa.develoverslife.memesfragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MemesViewModelFactory(private val tabTitle: TabTitles) :  ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MemesViewModel(tabTitle) as T
    }
}