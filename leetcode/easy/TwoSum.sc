/*
  https://leetcode.com/problems/two-sum/description/
  Given an array of integers, return indices of the two numbers such that they add up to a specific target.

  You may assume that each input would have exactly one solution, and you may not use the same element twice.

  Example:
  Given nums = [2, 7, 11, 15], target = 9,

  Because nums[0] + nums[1] = 2 + 7 = 9,
  return [0, 1].
 */

def twoSum(nums: Array[Int], target: Int): Array[Int] = {
  for (a <- 0 to nums.length - 2) {
    for (b <- a + 1 to nums.length - 1) {
      if (nums(a) + nums(b) == target) {
        return Array(a, b)
      }
    }
  }
  throw new Exception("No solution")
}

twoSum(Array(2,7,11,15), 9)
twoSum(Array(3,2,4), 6)