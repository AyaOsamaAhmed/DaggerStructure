package com.aya.daggerstructure.school

import android.util.Log
import javax.inject.Inject

class School {

    @Inject
    lateinit var student : Student

    var teacher : Teacher
    var manager : Manager
    var worker :Worker

    @Inject
    constructor( teacher : Teacher , manager: Manager , worker : Worker){
        this.teacher = teacher
        this.manager = manager
        this.worker = worker
    }

    @Inject
    fun beginStudent(student : Student){
        student.startUp()
    }

    fun startSchool(){
        manager.start()
        Log.d(TAG, "startSchool >>>>>>  worker: $worker  & school: $this")
    }

    companion object {
        private const val TAG = "School"
    }


}