package questions

/**
 * Created by erenalpaslan on 17.06.2023
 */
object ValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        var isValid: Boolean = true

        for (i in 0 until 9) {
            val row = board[i].filter { it.isDigit() }
            val isValidRow = row.distinct().size == row.size
            val isValidColumn = board.map {
                it[i]
            }.filter { it.isDigit() }.let {
                it.distinct().size == it.size
            }
            val isValidSubBoxes = isValidSubBoxes(board, i)
            if (!isValidRow || !isValidColumn || !isValidSubBoxes) {
                isValid = false
                break
            }
        }
        return isValid
    }

    private fun isValidSubBoxes(board: Array<CharArray>, index: Int): Boolean {
        val startRowIndex = (index / 3) * 3
        val startColumnIndex = (index % 3) * 3

        return board.slice(startRowIndex until startRowIndex + 3)
            .flatMap {
                it.slice(startColumnIndex until startColumnIndex + 3)
            }.filter { it.isDigit() }
            .let {
                it.distinct().size == it.size
            }

    }
}