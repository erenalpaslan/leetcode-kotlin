package interview

/**
 * Created by erenalpaslan on 3.06.2023
 */
object ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        var isDuplicate = false
        for (number in nums) {
            isDuplicate = nums.count { it == number } > 1
            if (isDuplicate) {
                break
            }
        }
        return isDuplicate
    }
}