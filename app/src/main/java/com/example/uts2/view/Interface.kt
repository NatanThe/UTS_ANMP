package com.example.uts2.view

import android.view.View
import com.example.uts2.model.Games
import com.example.uts2.model.User

interface NewsDetailClick {
    fun onNewsDetailClick(v: View)
}

interface BackLoginClick {
    fun onBackLoginClick(v: View)
}

interface BackMainClick {
    fun onBackMainClick(v: View)
}

interface LoginClick {
    fun onLoginClick(v: View, obj: User)
}

interface LogoutClick {
    fun onLogoutClick(v: View)
}

interface ProfileClick {
    fun onProfileClick(v: View)
}

interface RegistClick {
    fun onRegistClick(v: View)
}

interface ProfileChangeClick {
    fun onProfileChangeClick(v: View, obj: User)
}

interface CreateAccountClick {
    fun onCreateAccountClick(v: View, obj: User)
}

interface CreateNewsClick {
    fun onCreateNewsClick(v: View)
}

interface DeleteNewsClick {
    fun onDeleteNewsClick(v: View)
}

interface BackNewsListClick {
    fun onBackNewsListClick(v: View)
}

interface CreatedNewsClick {
    fun onCreatedNewsClick(v: View, obj: Games)
}

interface CancelCreateClick {
    fun onCancelCreateClick(v: View)
}

