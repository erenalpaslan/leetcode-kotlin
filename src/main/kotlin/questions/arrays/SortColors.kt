package questions.arrays

object SortColors {

    fun sortColors(nums: IntArray): Unit {
        var left = 0
        var right = nums.lastIndex
        var index = 0

        while (index <= right) {
            if (nums[index] == 0) {
                nums.swap(index, left)
                left++
            }else if(nums[index] == 2) {
                nums.swap(index, right)
                right--
                index--
            }
            index++
        }
    }

    fun IntArray.swap(i: Int, j: Int) {
        val temp = this[i]
        this[i] = this[j]
        this[j] = temp
    }

}