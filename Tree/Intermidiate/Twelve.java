import java.util.*;
public class Twelve {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}

class binaryTree11{
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
                tempNode.left = insertNode(tempNode.left,newData);
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
}