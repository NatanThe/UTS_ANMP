package com.example.uts2.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.uts2.model.Games
import com.example.uts2.model.User
import com.example.uts2.util.buildNewsDb
import com.example.uts2.util.buildUserDb
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class UserViewModel(application: Application)
    : AndroidViewModel(application), CoroutineScope {
    private val job = Job()
    val userLD = MutableLiveData<User>()

    fun addUser(list: List<User>) {
        launch {
            val db = buildUserDb(getApplication())
            db.userDao().insertAll(*list.toTypedArray())
        }
    }

    fun login(username:String, password:String) {
        launch {
            val db = buildUserDb(getApplication())
            db.userDao().selectUser(username, password)
        }
    }

    fun update(password:String, username:String) {
        launch {
            val db = buildUserDb(getApplication())
            db.userDao().changeProfile(password, username)
        }
    }

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.IO

}