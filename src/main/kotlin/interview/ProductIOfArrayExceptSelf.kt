package interview

/**
 * Created by erenalpaslan on 11.06.2023
 */
object ProductIOfArrayExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        var pre = 1
        val output = IntArray(nums.size) {
            1
        }
        for (i in 0 until nums.size - 1) {
            pre *= nums[i]
            output[i + 1] = pre
        }

        var post = 1
        for (i in nums.size - 2 downTo 0) {
            post *= nums[i + 1]
            output[i] *= post
        }
        return output
    }
}