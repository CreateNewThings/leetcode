/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {

    public int fib(int n) {
        int[] fnum = new int[n + 2];
        fnum[0] = 0;
        fnum[1] = 1;
        return F(fnum,n);
    }

    int F (int[] fnum,int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            fnum[n] = F(fnum,n - 1) + fnum[n - 2];
        }
        return fnum[n];
    }
}
// @lc code=end

