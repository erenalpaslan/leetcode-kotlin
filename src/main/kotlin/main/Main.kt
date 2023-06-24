package main

import questions.*

fun main(args: Array<String>) {
    val isValid = TwoSum2InputArraySorted.twoSum(intArrayOf(2,3,4), 6)
    println("=> : ${isValid.map { it }}")
}