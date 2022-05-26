package com.aya.daggerstructure.school

import android.util.Log
import javax.inject.Inject

class SchoolManager  : Manager  {

    private var sizeClass : Int

    @Inject
    constructor(sizeClass : Int){
        this.sizeClass = sizeClass
    }

    override fun start() {
        Log.d(TAG, "start: sizeClass : $sizeClass")
    }


    companion object {
        private const val TAG = "SchoolManager"
    }


}