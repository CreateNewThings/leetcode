/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续 1 的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) {
                temp++;
            }else{
                temp = 0;
            }
            if (temp > max){
                max = temp;
            }
        }
        return max;
    }
}
// @lc code=end

