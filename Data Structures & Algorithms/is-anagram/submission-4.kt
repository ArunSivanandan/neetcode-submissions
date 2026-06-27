class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        // arrOne.sort()
        // arrTwo.sort()

        return s.toCharArray().sorted() == t.toCharArray().sorted()
    }
}
