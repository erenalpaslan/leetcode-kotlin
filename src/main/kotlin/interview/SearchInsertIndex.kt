package interview

/**
 * Created by erenalpaslan on 19.11.2022
 */
object SearchInsertIndex {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val indexOfTarget = nums.indexOf(target)

        return if (indexOfTarget != -1)
            indexOfTarget
        else
            findInsertIndexOfTarget(nums, target)
    }

    private fun findInsertIndexOfTarget(nums: IntArray, target: Int): Int {
        val mutableList = nums.toMutableList()
        mutableList.add(target)
        mutableList.sort()
        return mutableList.indexOf(target)
    }
}