package questions

/**
 * Created by erenalpaslan on 24.06.2023
 */
object `3Sum` {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = HashSet<List<Int>>()
        nums.sort()

        for (i in nums.indices) {
            val x = nums[i]
            var left = i + 1
            var right = nums.lastIndex
            while (left < right) {
                val sum = nums[left] + nums[right] + x
                when {
                    sum < 0 -> left++
                    sum > 0 -> right--
                    else -> {
                        result.add(listOf(x, nums[left], nums[right]))
                        left++
                    }
                }
            }
        }

        return result.toList()
    }
}