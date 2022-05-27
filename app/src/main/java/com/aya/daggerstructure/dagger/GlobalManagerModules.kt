package com.aya.daggerstructure.dagger

import com.aya.daggerstructure.school.GlobalManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class GlobalManagerModules {

    var name : String

    constructor(name : String){
        this.name = name
    }

    @Provides
    @Singleton
    fun getgolbalManager ():GlobalManager{
        return GlobalManager(name)
    }

}