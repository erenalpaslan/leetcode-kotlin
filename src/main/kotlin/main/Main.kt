package main

import questions.*

fun main(args: Array<String>) {
    val isValid = `3Sum`.threeSum(intArrayOf(-1,0,1,2,-1,-4))
    println("=> : ${isValid.map { it }}")
}