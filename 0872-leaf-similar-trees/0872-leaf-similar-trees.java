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
    private void similar(List<Integer> list , TreeNode root){
            if(root == null){
                return;
            }
            if(root.left==null&&root.right==null){
            list.add(root.val);
            return;
        }
        similar(list,root.left);
        similar(list,root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        
        List<Integer> leafs1 = new ArrayList<>();
        List<Integer> leafs2 = new ArrayList<>();
        // if(root1==null && root2==null) {
		// 	return true;
		// }

		// if(root1.left!=null && root1.right !=null) {
        //     if(leafs.le)
		// 	leafs1.add(root1.left.val);
        //     leafs1.add(root1.right.val);
		// }
		// if(root2.left!=null && root2.right!=null) {
		// 	leafs2.add(root2.left.val);
        //     leafs2.add(root2.right.val);
		// }
        // leafSimilar(root1.left , root2.left);
		// leafSimilar(root1.right , root2.right);
		// // leafSimilar(root1.right);
        similar(leafs1, root1);
        similar(leafs2, root2);
        return leafs2.equals(leafs1);

	}
}

    
