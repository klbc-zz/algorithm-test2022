package akc.test01;

import java.util.Deque;
import java.util.LinkedList;

public class Test003 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e","f","x","y"};
        TreeNode head  = bfs(arr);// 广度构造二叉树
        TreeNode a = new TreeNode("a");
        TreeNode b = new TreeNode("b");
        TreeNode c = new TreeNode("c");
        TreeNode d = new TreeNode("d");
        TreeNode e = new TreeNode("e");
        TreeNode f = new TreeNode("f");
        TreeNode x = new TreeNode("x");
        TreeNode y = new TreeNode("y");
        a.leftChild = b; a.rightChild = c;
        b.leftChild = d;
        c.leftChild = e; c.rightChild = f;
        d.leftChild = x; d.rightChild = y;
        System.out.println("前序遍历");
        preorder(a);
        System.out.println("\n中序遍历");
        inorder(a);
        System.out.println("\n后序遍历");
        postorder(a);


    }
    static int i = 0;// 计数
    public static TreeNode createBinaryTree(String[] arr){
        if (arr == null || arr.length == 0) {
            return null;
        }
        TreeNode node = new TreeNode();
        if (i < arr.length) {// 如果二叉树数据空值正确，此判断可以省略
            node.data = arr[i++];
            if (node.data==null ) {
                return null;
            } else {
                node.leftChild = createBinaryTree(arr);
                node.rightChild = createBinaryTree(arr);
            }
        }
        return node;
    }
    public static TreeNode bfs(String[] arr){
        Deque<TreeNode> deque = new LinkedList<>();
        TreeNode a0 = new TreeNode(arr[0]);
        deque.offerLast(a0);
        int i=1;
        while (!deque.isEmpty()){
            TreeNode node = deque.pollFirst();
            if(i>=arr.length) break;
            node.leftChild = new TreeNode();
            node.leftChild.data = arr[i++];
            deque.offerLast(node.leftChild);
            if(i>=arr.length) break;
            node.rightChild = new TreeNode();
            node.rightChild.data = arr[i++];
            deque.offerLast(node.rightChild);
        }
        return a0;

    }
    public static void preorder(TreeNode node){
        if(node==null) return;
        System.out.print(node.data);
        preorder(node.leftChild);
        preorder(node.rightChild);
    }
    public static void inorder(TreeNode node){
        if(node==null) return;
        preorder(node.leftChild);
        System.out.print(node.data);
        preorder(node.rightChild);
    }
    public static void postorder(TreeNode node){
        if(node==null) return;
        preorder(node.leftChild);
        preorder(node.rightChild);
        System.out.print(node.data);
    }



}
