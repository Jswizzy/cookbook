fun main(args: Array<String>) {


    var a = 1
    var b = 2

    a = b.also { b = a }

    println("a = $a, b = $b")
}