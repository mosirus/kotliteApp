package com.brillante.kotlite.preferences

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.brillante.kotlite.R

class SessionManager (context: Context) {
    private var prefs: SharedPreferences = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE)

    companion object {
        const val USER_TOKEN = "user_token"
    }

    /**
     * Function to save auth token
     */
    fun saveAuthToken(token: String) {
        val editor = prefs.edit()
        editor.putString(USER_TOKEN, token)
        editor.apply()
    }

    /**
     * Function to fetch auth token
     */
    fun fetchAuthToken(): String? {
        Log.d("TOKEN", prefs.getString(USER_TOKEN, null).toString())
        return prefs.getString(USER_TOKEN, null)
    }
}