package questions

/**
 * Created by erenalpaslan on 30.10.2022
 */
object MergeTwoSortedList {


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val list = arrayListOf<Int>()
        list.addNextToList(list1)
        list.addNextToList(list2)
        list.sort()
        val nodes = list.createListNode()
        return nodes.firstOrNull()
    }

    private fun ArrayList<Int>.addNextToList(node: ListNode?): Unit {
        node?.let {n ->
            this.add(n.`val`)
            n.next?.let {
                this.addNextToList(n.next)
            }
        }

    }

    private fun ArrayList<Int>.createListNode(): ArrayList<ListNode> {
        val nodes = arrayListOf<ListNode>()
        this.forEachIndexed { index, i ->
            nodes.add(ListNode(i))
            if (index != 0){
                nodes[index - 1].apply {
                    this.next = nodes.last()
                }
            }
        }
        return nodes
    }

    fun ListNode.printNode() {
        println("${this.`val`} ${this.next }")
        if (this.next != null) {
            this.next?.printNode()
        }
    }

}