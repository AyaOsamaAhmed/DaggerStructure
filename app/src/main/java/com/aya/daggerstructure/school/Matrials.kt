package com.aya.daggerstructure.school

import android.util.Log

class Matrials {

    // we can't own this class  so can't annotate it with @Inject


    constructor(

    )

    fun getMatrial(){
        Log.d(TAG, "startUp: materials ")
    }
    companion object {
        private const val TAG = "Matrials"
    }
}