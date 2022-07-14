/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int temp = 0;
        for (int i = 0; i < length; i++) {
            if(nums[i] != 0) {
                nums[temp] = nums[i];
                temp++;
            }
        }
        for (;temp < length; temp++) {
            nums[temp] = 0;
        }
    }
}
// @lc code=end

