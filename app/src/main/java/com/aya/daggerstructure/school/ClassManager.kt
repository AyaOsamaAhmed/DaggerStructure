package com.aya.daggerstructure.school

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class ClassManager  : Manager  {

    var numStudent : Int
    var numTeacher : Int

    @Inject
   constructor(@Named("numStudent")numStudent : Int, @Named("numTeacher")numTeacher : Int ){
        this.numStudent = numStudent
        this.numTeacher = numTeacher
   }
    override fun start() {
        Log.d(TAG, "start: numStudent : $numStudent , numTeacher : $numTeacher")
    }

    companion object {
        private const val TAG = "ClassManager"
    }


}