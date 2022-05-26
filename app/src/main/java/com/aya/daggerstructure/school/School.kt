package com.aya.daggerstructure.school

import android.util.Log
import javax.inject.Inject

class School {

    @Inject
    lateinit var student : Student

    var teacher : Teacher
    var manager : Manager


    @Inject
    constructor( teacher : Teacher , manager: Manager){
        this.teacher = teacher
        this.manager = manager
    }

    @Inject
    fun beginStudent(student : Student){
        student.startUp()
    }

    fun startSchool(){
        manager.start()
        Log.d(TAG, "startSchool >>>>>>>>>>>>>>>>")
    }

    companion object {
        private const val TAG = "School"
    }


}