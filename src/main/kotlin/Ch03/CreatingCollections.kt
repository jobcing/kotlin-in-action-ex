package Ch03

/**
 * Created by ByeongChan on 2018. 5. 27..
 */

val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main(args: Array<String>) {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}