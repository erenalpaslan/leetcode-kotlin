package questions.arrays

object TwoSumNew {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = intArrayOf(0, 0)
        var left = 0

        while (left < nums.lastIndex) {
            for (right in left + 1 until nums.size) {
                val total = nums[left] + nums[right]
                if (total == target) {
                    result[0] = left
                    result[1] = right
                    return result
                }
            }
            left++
        }

        return result
    }

}