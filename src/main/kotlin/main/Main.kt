package main

import questions.*

fun main(args: Array<String>) {
    val isValid = ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama")
    println("=> : $isValid")
}