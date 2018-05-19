package Ch02

/**
 * Created by ByeongChan on 2018. 5. 19..
 */

class Person(
        val name: String,
        val isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)
}