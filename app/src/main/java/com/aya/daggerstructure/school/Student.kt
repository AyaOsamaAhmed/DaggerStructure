package com.aya.daggerstructure.school

import android.util.Log
import javax.inject.Inject

class Student {

    @Inject
    constructor()

    fun startUp(){
        Log.d(TAG, "startUp: materials ")
    }

    companion object{
        private const val TAG = "Student"
    }
}