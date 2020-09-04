import java.util.*;
public class Two{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        binaryTree1 bt1 = new binaryTree1();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            bt1.insertNode(sc.nextInt());
        bt1.inorder(sc.nextInt());
        sc.close();
    }
}

class binaryTree1{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    Node root;
    public void insertNode(int newData){
        root = insertNode(root,newData);
    }
    public Node insertNode(Node node,int newData){
        if(node==null){
            node = new Node(newData);
            return node;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            if(tempNode.left==null){
                tempNode.left = insertNode(tempNode.left, newData);
                break;
            }
            else
                queue.add(tempNode.left);
            if(tempNode.right==null){
                tempNode.right = insertNode(tempNode.right,newData);
                break;
            }
            else
                queue.add(tempNode.right);
        }
        return node;
    }
    public void inorder(int nthNode){
        inorder(root,nthNode);
    }
    static int count =0;
    static void inorder(Node node,int nthNode){
        if(node==null)
            return;
        if(count<=nthNode){
            inorder(node.left,nthNode);
            count++;
            if(count==nthNode)
                System.out.println("nth Node= "+node.data);
            inorder(node.right,nthNode);
        }
    }
}