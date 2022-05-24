package com.aya.daggerstructure.dagger

import com.aya.daggerstructure.school.Matrials
import com.aya.daggerstructure.school.Teacher
import dagger.Module
import dagger.Provides

@Module
class TeacherModules {

    @Provides
    fun getMaterial(): Matrials {
        val matrials  = Matrials()
        matrials.getMatrial()
        return matrials
    }

    @Provides
    fun getTeacher(matrials: Matrials): Teacher {
        return Teacher(matrials)
    }
}