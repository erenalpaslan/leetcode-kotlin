package questions

import java.util.Stack

/**
 * Created by erenalpaslan on 29.06.2023
 */
object EvaluateReversePolishNotation {

    private val operands = listOf("+", "-", "*", "/")

    fun evalRPN(tokens: Array<String>): Int {
        val operations: Stack<Int> = Stack()
        val list = tokens.toMutableList()

        while (operations.size < (tokens.size - 1) / 2) {
            val operandIndex = list.indexOfFirst { it in operands }
            val result = doOperation(list[operandIndex - 2].toInt(), list[operandIndex - 1].toInt(), list[operandIndex])
            operations.add(result)
            list.removeAt(operandIndex)
            list.removeAt(operandIndex - 1)
            list[operandIndex - 2] = result.toString()
        }

        return try {
            operations.pop()
        }catch (e: Exception) {
            tokens.firstOrNull()?.toInt() ?: 0
        }
    }

    fun doOperation(first: Int, second: Int, operand: String): Int {
        return when(operand) {
            "+" -> first + second
            "-" -> first - second
            "*" -> first * second
            else -> first / second
        }
    }
}