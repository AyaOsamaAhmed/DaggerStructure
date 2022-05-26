package com.aya.daggerstructure.dagger

import com.aya.daggerstructure.school.Manager
import com.aya.daggerstructure.school.SchoolManager
import dagger.Module
import dagger.Provides
import kotlin.properties.Delegates

@Module
 class  SchoolManagerModules {

    var  sizeClass :Int

    constructor( size : Int ){
        sizeClass = size
    }

    @Provides
    fun provideSizeClass():Int{
        return sizeClass
    }

    @Provides
     fun providerClass ( school : SchoolManager) :Manager{
         return school
     }
}