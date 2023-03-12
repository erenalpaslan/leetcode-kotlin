package interview

/**
 * Created by erenalpaslan on 12.03.2023
 */
object MiddleOfTheLinkedList {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun middleNode(head: ListNode?): ListNode? {
        val nodes = arrayListOf<ListNode>()
        var current: ListNode? = head
        while (current != null) {
            nodes.add(current)
            current = current.next
        }

        return nodes[(nodes.size / 2)]
    }
}