package classes

import kotlin.reflect.full.memberProperties

class Student (val roll_number:Int, val full_name:String)


fun main(args: Array<String>) {
    val student= Student(2013001, "Aanand Shekhar Roy")
    for (property in Student::class.memberProperties) {
        println("${property.name} = ${property.get(student)}")
    }
}