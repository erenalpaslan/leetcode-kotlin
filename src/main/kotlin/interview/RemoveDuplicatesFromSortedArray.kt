package interview

/**
 * Created by erenalpaslan on 16.11.2022
 */
object RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        val uniqueSet = nums.toHashSet().toIntArray().sorted()
        uniqueSet.indices.forEach {
            if (it < uniqueSet.size) {
                nums[it] = uniqueSet[it]
            }
        }
        return uniqueSet.size
    }
}