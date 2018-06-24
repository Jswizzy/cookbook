import java.lang.Float.intBitsToFloat

fun main(args: Array<String>) {

    // binary
    val bits = "11111111"
    println(bits.toLongOrNull(2))

    // octal
    val octal = "377"
    println(octal.toLongOrNull(10))

    // hex
    val hex = "ff"
    println(hex.toLongOrNull(16))

    val hex2 = "AA015BFF".toHexOrNull()
    println(hex2)

    val hex3 = "4d8ef3c2".toFloatFromHex()
    println(hex3)

}

fun String.toHexOrNull() = toLongOrNull(16)

fun String.toFloatFromHex(): Float {

    val long = toLong(16)

    return intBitsToFloat(long.toInt())
}
