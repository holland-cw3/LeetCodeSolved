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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        inorderAux(inorder, root);
        return inorder;
    }

    private void inorderAux(List<Integer> list, TreeNode curr){
		if(curr == null) {
			return;
		}
        inorderAux(list, curr.left);
        list.add(curr.val);
		inorderAux(list, curr.right);
	}
}