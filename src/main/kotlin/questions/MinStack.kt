package questions

import java.util.*

/**
 * Created by erenalpaslan on 29.06.2023
 */
object MinStack {

    private val _stack: Stack<Int> = Stack()

    fun push(`val`: Int) {
        _stack.push(`val`)
    }

    fun pop() {
        _stack.pop()
    }

    fun top(): Int = _stack.lastElement()

    fun getMin(): Int = Collections.min(_stack)

}