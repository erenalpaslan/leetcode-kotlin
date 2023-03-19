package interview

/**
 * Created by erenalpaslan on 19.03.2023
 */
object SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        //[2,2,2,1]
        val mapOfCounts = nums.associate { x ->
            x to nums.count {
                it == x
            }
        }
        val single = mapOfCounts.filterValues { it == 1 }
        return single.keys.first()
    }
}