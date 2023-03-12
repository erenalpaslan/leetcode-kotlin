package interview

/**
 * Created by erenalpaslan on 5.03.2023
 */
object BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        val index =  nums.binarySearch(target)
        return if (index < 0) -1 else index
    }
}