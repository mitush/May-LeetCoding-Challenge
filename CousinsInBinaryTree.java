/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode par1;
    TreeNode par2;
    int l1;
    int l2;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)return false;
        par1=par2=null;
        l1=l2=0;
        level(root,null,x,y,0);
        return par1!=par2 && l1==l2;
    }
    public void level(TreeNode root,TreeNode parent,int x,int y,int lvl){
        if(root==null)return;
        if(root.val==x){
            par1 =parent;
            l1 = lvl;
        }
        if(root.val==y){
            par2 =parent;
            l2 = lvl;
        }
        level(root.left,root,x,y,lvl+1);
        level(root.right,root,x,y,lvl+1);
    }
}
