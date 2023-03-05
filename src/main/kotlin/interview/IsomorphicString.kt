package interview

import java.util.regex.Pattern

/**
 * Created by erenalpaslan on 5.03.2023
 */
object IsomorphicString {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = hashMapOf<Char, Char>()
        for (index in s.indices) {
            val currentChar = s[index] //p
            val oppositeChar = t[index] //
            if (map.containsKey(currentChar)) {
                if (map[currentChar] != oppositeChar)
                    return false
            }else if (map[currentChar] == null && map.containsValue(oppositeChar)) {
                return false
            } else {
                map.put(currentChar, oppositeChar)
            }
        }
        return true
    }
}