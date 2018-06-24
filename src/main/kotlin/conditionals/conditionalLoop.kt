package conditionals

fun main(args: Array<String>) {

    (0..9).asSequence()
            .takeWhile { i ->
                i < 5
            }.forEach { i ->
                println(
                        "$i - ${i * 2}"
                )
            }
}