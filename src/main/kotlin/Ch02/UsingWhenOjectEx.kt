package Ch02

/**
 * Created by ByeongChan on 2018. 5. 19..
 */

fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
            setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
            else -> throw Exception("Dirty Color")
        }

fun main(args: Array<String>) {
    println(mix(Color.BLUE, Color.YELLOW))
}
