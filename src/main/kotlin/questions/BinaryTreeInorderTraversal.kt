package questions

import java.util.Stack

/**
 * Created by erenalpaslan on 23.11.2022
 */
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 *          3
 *      2
 * null     1
 *
 * [1, 3, 2]
 */
object BinaryTreeInorderTraversal {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun inorderTraversal(root: TreeNode?): List<Int> {
        return if (root != null) {
            val stack = Stack<TreeNode>()
            var currentNode: TreeNode = root
            while (stack.isNotEmpty()) {
                
            }
            emptyList()
        }else {
            emptyList()
        }
    }

    fun getLeftFirst(node: TreeNode): TreeNode {
        return when {
            node.hasLeft -> node.left!!
            node.hasRight -> node.right!!
            else -> node
        }
    }

    private val TreeNode.hasLeft
        get() = this.left != null

    private val TreeNode.hasRight
        get() = this.right != null


}