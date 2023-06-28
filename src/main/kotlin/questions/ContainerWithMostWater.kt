package questions

import java.util.Collections
import kotlin.math.absoluteValue
import kotlin.math.min

/**
 * Created by erenalpaslan on 26.06.2023
 */
object ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var mostWater = 0
        var left = 0
        var right = height.lastIndex
        while (left < right) {
            val leftPoint = height[left]
            val rightPoint = height[right]
            val area = calculateWaterArea(left, right, height)
            if (area > mostWater) {
                mostWater = area
            }
            if (leftPoint <= rightPoint) {
                left++
            }else {
                right--
            }
        }


        return mostWater
    }

    private fun calculateWaterArea(left: Int, right: Int, arr: IntArray): Int {
        val diff = Math.abs((left - right))
        return Math.min(arr[left], arr[right]) * diff
    }
}