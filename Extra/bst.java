import java.util.*;
class bst{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        bstTree b = new bstTree();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            b.insert(sc.nextInt());
        b.print();
            sc.close();
    }
}

class bstTree{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }
    Node root;
    public void insert(int newData){
        root = insertNode(root,newData);
    }
    public Node insertNode(Node root,int newData){
        if(root==null){
            root = new Node(newData);
            return root;
        }
        else{
            if(newData<root.data)
                root.left = insertNode(root.left, newData);
            else   
                root.right = insertNode(root.right, newData);
        }
        return root;
    }
    public void print(){
        System.out.println("prerder");
        preorder(root);
        System.out.println();
        System.out.println("inorder");
        inorder(root);
        System.out.println();
        System.out.println("postrder");
        postorder(root);
    }
    public void preorder(Node root){
        if(root==null)  
            return;
        else{
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void inorder(Node root){
        if(root==null)
            return;
        else{
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public void postorder(Node root){
        if(root==null)
            return;
        else{
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
}