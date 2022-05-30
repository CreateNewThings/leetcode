import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    int temp[];
    public int coinChange(int[] coins, int amount) {
        temp = new int[amount + 1];
        Arrays.fill(temp, -2);
        temp[0] = 0;   
        return minNum(amount, coins);
    }

    int minNum(int amount, int[] coins) {
        if (amount < 0) {
            return -1;
        }
        if (temp[amount] != -2) {
            return temp[amount];
        }

        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subProblem = minNum(amount - coin, coins);
            if (subProblem == -1) {
                continue;
            }
            res = Math.min(res, subProblem + 1);
        }
        temp[amount] = (res == Integer.MAX_VALUE) ? -1 : res;
        return temp[amount];
    }
}
// @lc code=end

