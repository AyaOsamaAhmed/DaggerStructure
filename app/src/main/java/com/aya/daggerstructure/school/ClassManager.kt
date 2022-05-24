package com.aya.daggerstructure.school

import android.util.Log
import javax.inject.Inject

class ClassManager  : Manager  {

    @Inject
    constructor(

    )

    override fun start() {
        Log.d(TAG, "start: ")
    }

    companion object {
        private const val TAG = "ClassManager"
    }


}