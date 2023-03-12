package interview

import model.ListNode

/**
 * Created by erenalpaslan on 12.03.2023
 */
object LinkedListCycle2 {

    fun detectCycle(head: ListNode?): ListNode? {
        val list = arrayListOf<ListNode>()
        var current = head
        while (current != null) {
            val index = list.indexOf(current.next)
            if (index != -1) {
                return current.next
            }
            list.add(current)
            current = current.next
        }

        return null
    }

}