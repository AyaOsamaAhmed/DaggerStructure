package com.aya.daggerstructure.dagger

import com.aya.daggerstructure.MainActivity
import com.aya.daggerstructure.school.School
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named
import javax.inject.Singleton

@PerActivity
//@Component ( dependencies = [GlobalManagerComponent::class], modules = [TeacherModules::class , ClassManagerModules::class ])
@Subcomponent (  modules = [TeacherModules::class , ClassManagerModules::class ])
interface SchoolComponent {

    fun getSchool(): School
    fun inject(main : MainActivity)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun numStudent(@Named("numStudent") numSchool:Int ):Builder

        @BindsInstance
        fun numTeacher(@Named("numTeacher") numTeacher:Int ):Builder

      //  fun getGlobalManagerComponent(global : GlobalManagerComponent ):Builder

        fun build():SchoolComponent

    }
}