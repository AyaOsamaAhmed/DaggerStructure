package com.aya.daggerstructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aya.daggerstructure.dagger.DaggerSchoolComponent
import com.aya.daggerstructure.dagger.SchoolComponent
import com.aya.daggerstructure.school.School
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

   @Inject
   lateinit var school1 : School

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component : SchoolComponent = DaggerSchoolComponent.create()
            component.inject(this)

        school1.startSchool()
    }
}