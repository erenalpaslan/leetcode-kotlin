package questions

/**
 * Created by erenalpaslan on 5.03.2023
 */
object FirstBadVersion {
    fun firstBadVersion(n: Int) : Int {
        var badVersion = -1
        var maxLimit = n
        var minLimit = 0
        while(badVersion < 0) {
            val half = ((maxLimit + minLimit) / 2) + 1
            if (isBadVersion(half)) {
                maxLimit = half
                if (!isBadVersion(half - 1))
                    badVersion = half
            }else {
                minLimit = half
            }
        }
        return badVersion
    }

    private fun isBadVersion(n: Int): Boolean {
        return n == 4 || n == 5
    }
}