package questions.arrays

object PalindromicSubstrings {
   fun countSubstrings(s: String): Int {
        var left = 0
        var right = 0
        var counter = 0

        while (left <= s.lastIndex) {
            if (right == s.length) {
                left++
                right = left
            }
            if (left >= s.length) {
                break
            }
            val sub = s.substring(left .. minOf(s.lastIndex, right))
            if (sub.isPalindrome()) {
                counter++
            }
            right++
        }
        return counter
    }

    fun String.isPalindrome() = this == this.reversed()
}