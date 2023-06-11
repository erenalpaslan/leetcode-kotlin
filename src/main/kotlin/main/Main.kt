package main

import interview.*
import interview.MergeTwoSortedList.printNode

fun main(args: Array<String>) {
    val isDuplicate = TopKFrequent.topKFrequent(intArrayOf(1, 2, 1, 6, 2, 3, 2), 2)
    println("==> ${isDuplicate.map { it }}")
}