package questions.arrays

object MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val first = nums1.slice(0 until m)
        val sortedArray = (first + nums2.toList()).sorted()
        for (i in sortedArray.indices) {
            nums1[i] = sortedArray[i]
        }
    }
}