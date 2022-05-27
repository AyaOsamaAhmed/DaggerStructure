package com.aya.daggerstructure.dagger

import com.aya.daggerstructure.school.GlobalManager
import dagger.Component
import javax.inject.Singleton


@Component (modules = [GlobalManagerModules::class])
@Singleton
interface GlobalManagerComponent {

    fun getGlobalManager():GlobalManager

}