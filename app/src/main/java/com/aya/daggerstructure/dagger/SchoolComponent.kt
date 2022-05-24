package com.aya.daggerstructure.dagger

import com.aya.daggerstructure.MainActivity
import com.aya.daggerstructure.school.School
import dagger.Component

@Component (modules = [TeacherModules::class , ClassManagerModules::class])
interface SchoolComponent {

    fun getSchool(): School
    fun inject(main : MainActivity)
}