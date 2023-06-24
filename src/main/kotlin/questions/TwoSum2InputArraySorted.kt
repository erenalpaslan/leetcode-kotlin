package questions

/**
 * Created by erenalpaslan on 24.06.2023
 */
object TwoSum2InputArraySorted {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        for (i in numbers.indices) {
            for (j in i + 1 .. numbers.lastIndex) {
                val tempTotal = numbers[i] + numbers[j]
                if (tempTotal == target) {
                    return intArrayOf(i + 1, j + 1)
                }
            }
        }

        return intArrayOf()
    }
}