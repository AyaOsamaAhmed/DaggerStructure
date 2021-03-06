package com.aya.daggerstructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aya.daggerstructure.dagger.SchoolComponent
import com.aya.daggerstructure.school.School
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

   @Inject
   lateinit var school1 : School

    @Inject
    lateinit var school2 : School

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //   val component : SchoolComponent = DaggerSchoolComponent.create()

        /*val component : SchoolComponent = DaggerSchoolComponent.builder()
            .schoolManagerModules(SchoolManagerModules(100)).build()
*/

     /*   val component : SchoolComponent = DaggerSchoolComponent.builder()
            .numStudent(100)
            .numTeacher(15200)
            .getGlobalManagerComponent( ( application as ExampleApp).getInstanceGlobalComponent())
            .build()

      */
         //   .schoolManagerModules(SchoolManagerModules(100)).build()

      /*  val component :SchoolComponent = ( application as ExampleApp).getInstanceGlobalComponent().getSchoolComponent(
            SchoolManagerModules(150)
        )*/

        val component : SchoolComponent = ( application as ExampleApp).getInstanceGlobalComponent()
            .getSchoolComponent().create(100,15200)

        component.inject(this)

        school1.startSchool()
        school2.startSchool()
    }
}