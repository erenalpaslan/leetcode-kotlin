package interview

/**
 * Created by erenalpaslan on 23.11.2022
 */
object MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var j = 0
        for (i in m until nums1.size) {
            nums1[i] = nums2[j]
            j++
        }
        nums1.sort()
    }
}