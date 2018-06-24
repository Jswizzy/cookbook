import java.util.logging.Logger

public fun <R : Any> R.logger(): Lazy<Logger> {
    return lazy { Logger.getLogger(this.javaClass.name) }
}

class SomeClass {
    companion object { val log by logger() }

    fun do_something() {
        log.info("Did Something")
    }
}

fun main(args: Array<String>) {
    SomeClass().do_something()
}

