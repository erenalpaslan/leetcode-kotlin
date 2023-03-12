package main

import interview.*
import interview.ClimbingStairs.climbStairs
import interview.MergeTwoSortedList.printNode

fun main(args: Array<String>) {

    val linked = MiddleOfTheLinkedList.ListNode(1).apply {
        next = MiddleOfTheLinkedList.ListNode(2).apply {
            next = MiddleOfTheLinkedList.ListNode(3).apply {
                next = MiddleOfTheLinkedList.ListNode(4).apply {
                    next = MiddleOfTheLinkedList.ListNode(5)
                }
            }
        }
    }
    println(MiddleOfTheLinkedList.middleNode(linked)?.`val`)
}