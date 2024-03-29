package questions.arrays

object MinimumSizeSubArraySum {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var sum = 0
        var left = 0
        var minLength = Int.MAX_VALUE

        for (right in nums.indices) {
            sum += nums[right]
            while (sum >= target) {
                minLength = minOf(minLength, right - left + 1)
                sum -= nums[left]
                left++
            }
        }

        return if (minLength == Int.MAX_VALUE) 0 else minLength
    }


}