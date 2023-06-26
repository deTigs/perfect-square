import kotlin.math.sqrt

fun main() {
    val number = 26
    val squareRoot = sqrt(number.toDouble())
    if ((squareRoot - squareRoot.toInt()) == 0.0) {
        println("A perfect square.")
    }
    else {
        println("Not a perfect square.")
    }
}