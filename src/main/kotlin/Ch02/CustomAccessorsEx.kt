package Ch02

/**
 * Created by ByeongChan on 2018. 5. 19..
 */

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}