package classes

import java.time.LocalDate

data class Event @JvmOverloads constructor (var eventName: String? = "", var date: LocalDate? = LocalDate.now(), var isPrivate: Boolean = false)

@JvmOverloads fun foo(a:Int=0, b: Double =0.0, c:String="some default value"){
    println("a=$a , b=$b ,c = $c")
}
