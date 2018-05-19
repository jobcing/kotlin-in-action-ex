package Ch01

/**
 * Created by ByeongChan on 2018. 5. 19..
 */

data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>){
    val persons = listOf(Person("Alice"),
                        Person("Bob", age = 29))

    val oldest = persons.maxBy { it.age ?: 0}
    println("The oldest is : $oldest")
}