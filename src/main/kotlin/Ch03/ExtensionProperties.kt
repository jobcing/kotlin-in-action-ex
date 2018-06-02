package Ch03

/**
 * Created by ByeongChan on 2018. 6. 2..
 */

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {
    println("Kotiln".lastChar)
    val sb = StringBuilder("Kotiln?")
    sb.lastChar = '!'
    println(sb)
}