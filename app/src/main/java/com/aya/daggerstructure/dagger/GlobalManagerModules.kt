package com.aya.daggerstructure.dagger

import com.aya.daggerstructure.school.GlobalManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class GlobalManagerModules {

    @Provides
    @Singleton
    fun getgolbalManager ():GlobalManager{
        return GlobalManager()
    }

}