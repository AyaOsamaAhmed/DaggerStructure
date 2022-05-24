package com.aya.daggerstructure.dagger

import com.aya.daggerstructure.school.ClassManager
import com.aya.daggerstructure.school.Manager
import dagger.Binds
import dagger.Module

@Module
abstract class  ClassManagerModules {

    @Binds
    abstract fun providerClass (manager : ClassManager) :Manager
}