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
    // public void pre1(TreeNode p, List<Integer> p1){
    //     if(p==null){
    //         p1.add(null);
    //         return;}
    //     p1.add(p.val);
    //     pre1(p.left, p1);
    //     pre1(p.right, p1);      
    // }
    // public void pre2(TreeNode q, List<Integer> q1){
    //     if(q==null){q1.add(null);
    //         return;}
    //     q1.add(q.val);
    //     pre1(q.left, q1);
    //     pre1(q.right, q1);      
    // }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // List<Integer> p1=new ArrayList<>();
        // List<Integer> q1=new ArrayList<>();
        // pre1(p, p1);
        // pre2(q, q1);
        // boolean bool=p1.equals(q1);
        // return bool;
        //recursive 
        if(p==null && q==null){
            return true;
        }
        return (p!=null&&q!=null)&&(p.val==q.val)&&isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    }
}