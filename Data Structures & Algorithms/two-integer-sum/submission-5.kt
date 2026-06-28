class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var firstIndex = 0
        var secondIndex = 0

        while (firstIndex < nums.size) {
            nums.forEachIndexed { index, item ->
                if (firstIndex != index && nums[firstIndex] + item == target) {
                    secondIndex = index
                    return intArrayOf(firstIndex, secondIndex)
                }
            }
            firstIndex++
        }
        return intArrayOf(firstIndex, secondIndex)
    }
}
