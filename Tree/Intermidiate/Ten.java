import java.util.*;
public class Ten {
    public static void main(String []agrs){
        Scanner sc = new Scanner(System.in);
        binaryTree9 bt9 = new binaryTree9();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            bt9.insertNode(sc.nextInt());
        bt9.inorder();
        bt9.intoSumTree();
        bt9.inorder();
        sc.close();
    }
}

class binaryTree9{
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
                tempNode.right = insertNode(tempNode.right, newData);
                break;
            }
            else
                queue.add(tempNode.right);
        }
        return node;
    }
    public void inorder(){
        inorder(root);
    }
    public void inorder(Node node){
        if(node==null)
            return;
        else{
            inorder(node.left);
            System.out.print(node.data+" ");
            inorder(node.right);
        }
    }
    public void intoSumTree(){
        intoSumTree(root);
    }
    public int intoSumTree(Node node){
        if(node==null)
            return 0;
        int oldData = node.data;
        node.data = intoSumTree(node.left) + intoSumTree(node.right);
        return node.data + oldData;  
    } 
}