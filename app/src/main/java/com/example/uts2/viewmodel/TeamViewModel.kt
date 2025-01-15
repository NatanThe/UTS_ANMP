package com.example.uts2.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.uts2.model.Games

class TeamViewModel : ViewModel() {
    val gameLD = MutableLiveData<Games>()

}
