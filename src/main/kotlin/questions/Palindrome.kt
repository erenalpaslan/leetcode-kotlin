package questions

/**
 * Created by erenalpaslan on 29.10.2022
 */
object Palindrome {
    fun isPalindrome(x: Int): Boolean = x.toString().reversed() == x.toString()
}