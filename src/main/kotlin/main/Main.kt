package main

import questions.*

fun main(args: Array<String>) {
    val isDuplicate = ProductIOfArrayExceptSelf.productExceptSelf(intArrayOf(1,2,3,4))
    println("==> ${isDuplicate.map { it }}")
}