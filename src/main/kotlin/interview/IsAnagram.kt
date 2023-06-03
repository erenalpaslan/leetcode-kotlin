package interview

/**
 * Created by erenalpaslan on 3.06.2023
 */
object IsAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length)
            return false

        val sortedS = s.toCharArray().sorted()
        val sortedT = t.toCharArray().sorted()
        var isAnagram = true
        for (i in 0 until sortedS.count()) {
            isAnagram = sortedS[i] == sortedT[i]
            if (!isAnagram)
                break

        }
        return isAnagram
    }
}