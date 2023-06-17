package questions

import java.util.*

/**
 * Created by erenalpaslan on 30.10.2022
 */
object ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<String>()
        s.forEach {
            when (it.toString()) {
                "{" -> stack.push("}")

                "(" -> stack.push(")")
                "[" -> stack.push("]")
                else -> {
                    if (stack.isEmpty() || stack.pop() != it.toString()) {
                        return false
                    }
                }
            }
        }

        return stack.isEmpty()
    }
}