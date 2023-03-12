package main

import interview.*
import interview.ClimbingStairs.climbStairs
import interview.MergeTwoSortedList.printNode

fun main(args: Array<String>) {

    val linked = ReverseLinkedList.ListNode(1).apply {
        next = ReverseLinkedList.ListNode(2).apply {
            next = ReverseLinkedList.ListNode(3).apply {
                next = ReverseLinkedList.ListNode(4).apply {
                    next = ReverseLinkedList.ListNode(5)
                }
            }
        }
    }
    println(ReverseLinkedList.reverseList(linked))
}