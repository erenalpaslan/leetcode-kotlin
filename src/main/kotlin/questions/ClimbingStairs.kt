package questions

/**
 * Created by erenalpaslan on 19.11.2022
 */
object ClimbingStairs {
    /*
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     */

    fun climbStairs(n: Int): Int {
        val count = IntArray(n + 1)
        val steps = arrayOf(1, 2)
        count[0] = 1

        for (i in 1..n) {
            for (j in steps.indices) {
                if (i >= steps[j])
                    count[i] += count[i - steps.get(j)]
            }
        }

        return count[n]
    }

}