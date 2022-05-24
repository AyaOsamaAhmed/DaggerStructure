package com.aya.daggerstructure.school

import android.util.Log
import javax.inject.Inject

class SchoolManager  : Manager  {

    @Inject
    constructor(

    )

    override fun start() {
        Log.d(Companion.TAG, "start: ")
    }

    companion object {
        private const val TAG = "SchoolManager"
    }


}