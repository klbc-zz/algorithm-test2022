//import javax.swing.tree.TreeNode;
class TreeNode {
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

public class Test26 {

    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        Test26 t = new Test26();
        t.constructMaximumBinaryTree(nums);


    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = new TreeNode();

        dfs(nums,root,0,nums.length-1);
        return root;

    }
    public void dfs(int[] nums,TreeNode root,int l,int r){
        int max = l;
        for(int i=l;i<=r;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        root.val = nums[max];
        if(max-1-l>0){
            root.left = new TreeNode();
            dfs(nums,root.left,l,max-1);
        }
        if(r-max-1>0){
            root.right = new TreeNode();
            dfs(nums,root.right,max+1,r);
        }

    }

}
