class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val arrOne = s.toCharArray()
        val arrTwo = t.toCharArray()

        arrOne.sort()
        arrTwo.sort()

        return arrOne.joinToString() == arrTwo.joinToString()
    }
}
