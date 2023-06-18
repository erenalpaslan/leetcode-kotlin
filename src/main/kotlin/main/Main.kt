package main

import questions.*

fun main(args: Array<String>) {
    ValidSudoku.isValidSudoku(
        arrayOf(
            charArrayOf('.', '.', '4', '.', '.', '.', '6', '3', '.'),
            charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
            charArrayOf('5', '.', '.', '.', '.', '.', '.', '9', '.'),
            charArrayOf('.', '.', '.', '5', '6', '.', '.', '.', '.'),
            charArrayOf('4', '.', '3', '.', '.', '.', '.', '.', '1'),
            charArrayOf('.', '.', '.', '7', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '5', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.')
        )
    )
}