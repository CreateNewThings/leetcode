/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
 */

// @lc code=start

// Definition for a binary tree node.
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
    int res;
    int target;
    boolean found = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        this.target = targetSum;
        traverse(root);
        return found;
    }
    void traverse (TreeNode root) {
        if (root == null) {
            return;
        }
        res += root.val;
        if (root.left == null && root.right == null && res == target) {
            found = true;
        }
        traverse(root.left);
        traverse(root.right);
        res -= root.val;
    }
}
// @lc code=end

