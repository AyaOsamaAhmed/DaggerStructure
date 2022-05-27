package com.aya.daggerstructure

import android.app.Application
import com.aya.daggerstructure.dagger.DaggerGlobalManagerComponent
import com.aya.daggerstructure.dagger.GlobalManagerComponent
import com.aya.daggerstructure.dagger.GlobalManagerModules


class ExampleApp : Application() {

    lateinit var globalManagerComponent : GlobalManagerComponent

    override fun onCreate() {
        super.onCreate()

        globalManagerComponent = DaggerGlobalManagerComponent.factory().create(GlobalManagerModules("New Modular"))

       // globalManagerComponent.getGlobalManager()
    }

    fun  getInstanceGlobalComponent ():GlobalManagerComponent{
        return globalManagerComponent
    }
}