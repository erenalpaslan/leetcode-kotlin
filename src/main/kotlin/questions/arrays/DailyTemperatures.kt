package questions.arrays

object DailyTemperatures {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        var left = 0
        var right = 1
        var distance = 0
        val result = arrayListOf<Int>()
        while (left != temperatures.size) {
            if (right > temperatures.lastIndex) {
                left++
                right = left + 1
                distance = 0
                result.add(distance)
                continue
            }
            if (temperatures[right] > temperatures[left]) {
                result.add(right - left)
                left++
                right = left + 1
                distance = 0
            }else {
                distance++
                right++
            }
        }
        return result.toIntArray()
    }
}