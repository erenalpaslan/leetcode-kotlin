package questions

import java.util.*

/**
 * Created by erenalpaslan on 24.06.2023
 */
object ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        val clearedText = s.toLowerCase(Locale.getDefault()).filter { char ->  char.isLetterOrDigit() }
        var reverseIndex = clearedText.lastIndex
        var isValidPalindrome = true
        for (i in clearedText.indices) {
            if (clearedText[i] == clearedText[reverseIndex]) {
                reverseIndex--
                continue
            } else {
                isValidPalindrome = false
                break
            }
        }

        return isValidPalindrome
    }
}