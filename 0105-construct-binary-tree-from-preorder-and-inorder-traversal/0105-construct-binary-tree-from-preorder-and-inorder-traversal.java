/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int pre = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return solve(preorder, inorder, 0, inorder.length - 1);
    }

    public TreeNode solve(int[] preorder, int[] inorder, int start, int end) {

        if(start > end) {
            return null;
        }

        int rootVal = preorder[pre];
        pre++;

        TreeNode root = new TreeNode(rootVal);

        int index = start;

        while(inorder[index] != rootVal) {
            index++;
        }

        root.left = solve(preorder, inorder, start, index - 1);

        root.right = solve(preorder, inorder, index + 1, end);

        return root;
    }
}