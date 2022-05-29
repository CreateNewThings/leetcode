/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
 */

// @lc code=start

//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return res;
    }
    int maxDepth(TreeNode root){
        if (root == null) {
            return 0;
        }
        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);

        res = Math.max(res, maxLeft + maxRight);
        return 1 + Math.max(maxLeft, maxRight);
    }
}
// @lc code=end

