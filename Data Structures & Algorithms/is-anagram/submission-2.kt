class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        
        val arrOne = s.toCharArray().sorted()
        val arrTwo = t.toCharArray().sorted()

        // arrOne.sort()
        // arrTwo.sort()

        return arrOne == arrTwo
    }
}
