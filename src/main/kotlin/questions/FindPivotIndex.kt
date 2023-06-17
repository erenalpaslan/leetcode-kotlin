package questions

/**
 * Created by erenalpaslan on 4.03.2023
 */
object FindPivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        var pivotIndex = -1
        for (index in nums.indices) {
            val sumOfLeft = sumLeftOfIndex(nums, index)
            val sumOfRight = sumRightOfIndex(nums, index)
            if (sumOfLeft == sumOfRight) {
                pivotIndex = index
                break
            }
        }

        return pivotIndex
    }

    private fun sumLeftOfIndex(nums: IntArray, index: Int): Int {
        return if (index != 0) {
            nums.slice(0 until index).sum()
        }else {
            0
        }
    }

    private fun sumRightOfIndex(nums: IntArray, index: Int): Int {
        return if (index == nums.lastIndex) {
            0
        } else {
            nums.slice(index + 1..nums.lastIndex).sum()
        }
    }

}