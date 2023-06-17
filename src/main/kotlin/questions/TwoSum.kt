package questions

/**
 * Created by erenalpaslan on 29.10.2022
 */
object TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }

        throw IllegalArgumentException("No solution")
    }
}