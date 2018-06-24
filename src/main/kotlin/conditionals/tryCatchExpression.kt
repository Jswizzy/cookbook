package conditionals

fun main(args: Array<String>) {
    val str="abc"
    val a: Int? = try { str.toInt() } catch (e: NumberFormatException) { -1 }
    println(a)
}