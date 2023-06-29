package main

import questions.*

fun main(args: Array<String>) {
    val isValid = EvaluateReversePolishNotation.evalRPN(arrayOf("2","1","+","3","*"))
    println("=> : ${isValid}}")
}