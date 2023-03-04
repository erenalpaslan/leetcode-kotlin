package interview

/**
 * Created by erenalpaslan on 30.10.2022
 */
object LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        val builder = StringBuilder("")
        try {
            strs.firstOrNull()?.forEachIndexed { index, c ->
                val isAllContains = strs.all { it[index] == c }
                if (isAllContains) {
                    builder.append(c)
                }else {
                    return builder.toString()
                }
            }
        }catch (e: Exception) {
        }
        return builder.toString()
    }
}