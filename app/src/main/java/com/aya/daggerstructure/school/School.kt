package com.aya.daggerstructure.school

import android.util.Log
import com.aya.daggerstructure.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class School {

    @Inject
    lateinit var student : Student

    var teacher : Teacher
    var manager : Manager
   // var worker :Worker
    var globalManager : GlobalManager

    @Inject
    constructor( teacher : Teacher , manager: Manager , globalManager: GlobalManager){ //, worker : Worker
        this.teacher = teacher
        this.manager = manager
     //   this.worker = worker
        this.globalManager = globalManager
    }

    @Inject
    fun beginStudent(student : Student){
        student.startUp()
    }

    fun startSchool(){
        manager.start()
        Log.d(TAG, "startSchool >>>>>>  & school: $this  && global : $globalManager")
        // worker: $worker
    }

    companion object {
        private const val TAG = "School"
    }


}