package akc.test01;

public class TreeNode {
    public String data;
    public TreeNode leftChild;
    public TreeNode rightChild;
    public TreeNode(String data){
        this.data = data;
    }
    public TreeNode(){
    }
    public TreeNode(String data,TreeNode leftChild,TreeNode rightChild){
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
