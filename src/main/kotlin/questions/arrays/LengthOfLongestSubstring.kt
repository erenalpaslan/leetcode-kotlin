package questions.arrays

object LengthOfLongestSubstring {

    fun lengthOfLongestSubstring(s: String): Int {
        val set = mutableSetOf<Char>()
        var left = 0
        var length = 0

        for (right in s.indices) {
            while (s[right] in set) {
                set.remove(s[left])
                left++
            }
            set.add(s[right])
            length = maxOf(length, right - left + 1)
        }

        return length
    }

}