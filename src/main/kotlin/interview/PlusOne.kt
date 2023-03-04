package interview

import java.lang.StringBuilder

/**
 * Created by erenalpaslan on 16.11.2022
 */
object PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        var reversedIndex = digits.size - 1
        var shouldAddOne = true
        
        for (i in digits) {
            if (shouldAddOne) {
                var tmp = digits[reversedIndex] + 1
                if (tmp > 9) {
                    tmp = 0
                    shouldAddOne = true
                }else {
                    shouldAddOne = false
                }
                digits[reversedIndex] = tmp
                if (reversedIndex == 0 && shouldAddOne) {
                    digits[0] = 1

                    break
                }
            }else {
                break
            }
            reversedIndex -= 1
        }
        println(digits.map { it.toString() })
        return digits
    }
}