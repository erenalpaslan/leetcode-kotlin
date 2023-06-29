package questions

import java.util.Collections

/**
 * Created by erenalpaslan on 28.06.2023
 */
object TrappingRainWater {

    fun trap(height: IntArray): Int {
        var total = 0
        var pointer = 0
        while (pointer < height.size) {
            val current = height[pointer] // 1
            if (current == 0 || pointer == height.lastIndex) {
                pointer++
                continue
            }

            val nextIndex = height.slice(pointer + 1 .. height.lastIndex).let { subList ->
                return@let subList.indexOf(subList.firstOrNull { it >= current } ?: Collections.max(subList)) + pointer + 1
            }

            val next = height[nextIndex]
            val trappedWater = (Math.min(current, next) * (Math.abs(pointer - (nextIndex - 1)))) - height.slice(pointer + 1 until nextIndex).sum()
            total += trappedWater
            pointer = nextIndex
        }
        return total
    }
}