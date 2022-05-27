package com.aya.daggerstructure.dagger

import dagger.Component
import javax.inject.Singleton


@Component (modules = [GlobalManagerModules::class])
@Singleton
interface GlobalManagerComponent {

    fun getSchoolComponent():SchoolComponent.Factory


    //@subcomponent.Builder --> fun getSchoolComponent():SchoolComponent.Builder
    //@Subcomponent -->  schoolManagerModules: SchoolManagerModules
 //   fun getGlobalManager():GlobalManager

    @Component.Factory
    interface Factory {

        fun  create(globalManager :GlobalManagerModules):GlobalManagerComponent
    }
}