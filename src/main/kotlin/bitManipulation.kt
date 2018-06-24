fun main(args: Array<String>) {
    val b10 = 0b10 //2
    val b11 = 0b11 //3

    // or
    println(b10 or b11) //3

    // and
    println(b10 and b11) //2

    // xor
    println(b10 xor b11) //1

    // 2's complement of an integer n is equal to -(n+1), negative notation of a binary number
    println(b10.inv()) //-3

    // shifts
    println(b10 shl 1) // 4
    println(b10 shr 1) // 1
    println(b10 ushr 1) //1

}

