package questions

/**
 * Created by erenalpaslan on 12.03.2023
 */
object ReverseLinkedList {

    /**
     * 1 -> 2 -> 3 -> 4 -> 5
     */
    fun reverseList(head: ListNode?): ListNode? {
        var next: ListNode? = null
        var current: ListNode? = head
        var prev: ListNode? = null
        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        next = prev
        return next
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}