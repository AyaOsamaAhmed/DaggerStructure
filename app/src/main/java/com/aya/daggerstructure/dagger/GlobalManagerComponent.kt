package com.aya.daggerstructure.dagger

import dagger.Component
import javax.inject.Singleton


@Component (modules = [GlobalManagerModules::class])
@Singleton
interface GlobalManagerComponent {

    fun getSchoolComponent():SchoolComponent.Builder
    //schoolManagerModules: SchoolManagerModules
 //   fun getGlobalManager():GlobalManager

}