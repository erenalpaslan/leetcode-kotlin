package questions

import kotlin.math.sqrt

/**
 * Created by erenalpaslan on 19.11.2022
 */
object Sqrtx {
    fun mySqrt(x: Int): Int {
        return sqrt(x.toDouble()).toInt()
    }
}