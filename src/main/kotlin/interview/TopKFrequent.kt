package interview

/**
 * Created by erenalpaslan on 3.06.2023
 */
object TopKFrequent {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val associations = nums.associate {num ->
            num to nums.count { it == num }
        }
        val sorted = associations.entries.sortedByDescending {
            it.value
        }
        val topKFrequent = mutableListOf<Int>()
        for (i in 0 until k) {
            topKFrequent.add(sorted.get(i).key)
        }
        return topKFrequent.toIntArray()
    }
}