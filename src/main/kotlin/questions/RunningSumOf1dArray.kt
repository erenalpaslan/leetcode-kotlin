package questions

/**
 * Created by erenalpaslan on 4.03.2023
 */
object RunningSumOf1dArray {
    fun runningSum(nums: IntArray): IntArray {
        val sumList = arrayListOf<Int>()
        nums.forEachIndexed { index, i ->
            val sum = if (sumList.isNotEmpty()) {
                i + sumList.last()
            }else {
                i
            }

            sumList.add(sum)
        }
        return sumList.toIntArray()
    }
}