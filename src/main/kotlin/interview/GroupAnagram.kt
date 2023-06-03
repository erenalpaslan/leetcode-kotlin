package interview

/**
 * Created by erenalpaslan on 3.06.2023
 */
object GroupAnagram {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val list = strs.toMutableList()
        val anagrams: ArrayList<ArrayList<String>> = arrayListOf()
        while (list.isNotEmpty()) {
            val s = list[0]
            val groupedAnagrams = arrayListOf<String>()
            groupedAnagrams.add(s)
            list.removeAt(0)
            list.forEach {t ->
                val isAnagram = isAnagram(s, t)
                if (isAnagram)
                    groupedAnagrams.add(t)
            }
            list.removeAll(groupedAnagrams)
            anagrams.add(groupedAnagrams)
        }
        return anagrams
    }

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length)
            return false

        val sortedS = s.toCharArray().sorted()
        val sortedT = t.toCharArray().sorted()
        var isAnagram = true
        for (i in 0 until sortedS.count()) {
            isAnagram = sortedS[i] == sortedT[i]
            if (!isAnagram)
                break

        }
        return isAnagram
    }
}