// 1. Subtree of Another Tree
// https://leetcode.com/problems/subtree-of-another-tree/

class Solution {

    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) {
            return true;
        } else if(root == null || subRoot == null) {
            return false;
        } else if(root.val != subRoot.val) {
            return false;
        }
        
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) {
            return true;
        }
        if(root == null) {
            return false;
        }
        if(root.val == subRoot.val) {
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }
        boolean leftPresent = isSubtree(root.left, subRoot);
        boolean rightPresent = isSubtree(root.right, subRoot);

        return leftPresent || rightPresent;
    }
}