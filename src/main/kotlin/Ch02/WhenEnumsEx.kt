package Ch02

/**
 * Created by ByeongChan on 2018. 5. 19..
 */

fun getMnemonic(color : Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }

fun main(args: Array<String>){
    println(getMnemonic(Color.BLUE))
}