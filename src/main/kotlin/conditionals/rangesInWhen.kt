package conditionals

fun main(args: Array<String>) {
    val x = ob(2, true, 500)
    when(x.value){
        magicNum(x.value) -> println("$x is a magic number and         ${if(x.valid) "valid" else "invalid"}")
        in (1..10) -> {
            println("lies between 1 to 10, value: ${if(x.value <           x.max) x.value else x.max}")
        }
        20,21 -> println("$x is special and has direct exit access")
        else -> println("$x needs to be executed")
    }
}
data class ob(val value: Int, val valid: Boolean, val max: Int)
fun magicNum(a: Int): Int {
    return if(a in (15..25)) a else 0
}