package interview

/**
 * Created by erenalpaslan on 5.03.2023
 */
object IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.length > t.length)
            return false

        var controlText = t
        var cursor = t.length
        for (index in s.indices) {
            val current = s[s.lastIndex - index]
            val lastIndexOfCurrent = controlText.lastIndexOf(current)
            if (lastIndexOfCurrent == -1 || cursor < lastIndexOfCurrent)
                return false
            else
                controlText = controlText.replaceRange(lastIndexOfCurrent, lastIndexOfCurrent + 1, "-")
                cursor = lastIndexOfCurrent
        }

        return true
    }
}