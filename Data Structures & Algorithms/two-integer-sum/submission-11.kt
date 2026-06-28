class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var firstIndex = 0
        var secondIndex = nums.size - 1
        // var sum = 0

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
        // while(firstIndex < secondIndex) {
        //     sum = nums[firstIndex] + nums[secondIndex]
        //     when {
        //         sum == target -> return intArrayOf(firstIndex, secondIndex)
        //         sum < target -> firstIndex++
        //         sum > target -> secondIndex--
        //     }
        // }

        // return intArrayOf(firstIndex, secondIndex)
    }
}
