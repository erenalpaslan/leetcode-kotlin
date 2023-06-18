package questions

/**
 * Created by erenalpaslan on 18.06.2023
 */
object LongestConsecutiveSequence {

    fun longestConsecutive(nums: IntArray): Int {
        val clearedNums = nums.sorted().distinct()

        val consecutives = arrayListOf<ArrayList<Int>>()
        var tempSubList = arrayListOf<Int>()

        for (i in clearedNums.indices) {
            val current = clearedNums[i]
            if (tempSubList.isEmpty()) {
                tempSubList.add(current)
                if (i == clearedNums.lastIndex) {
                    consecutives.add(tempSubList)
                    tempSubList = arrayListOf()
                }
            }else if (current - tempSubList.last() == 1) {
                tempSubList.add(current)
                if (i == clearedNums.lastIndex) {
                    consecutives.add(tempSubList)
                    tempSubList = arrayListOf()
                }
            }else {
                if (tempSubList.size > 1) {
                    consecutives.add(tempSubList)
                }
                tempSubList = arrayListOf()
                tempSubList.add(current)
            }
        }

        return consecutives.sortedByDescending { it.size }.firstOrNull()?.size ?: 0
    }

}