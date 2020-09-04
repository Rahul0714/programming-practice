import java.util.*;
public class avlTree {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        avl a = new avl();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            a.insert(sc.nextInt());
        a.print();
        sc.close();
    }
}

class avl{
    class Node{
        int data;
        Node left;
        Node right;
        int height;
        Node(int data){
            this.data = data;
            height = 1;
        }
    }
    Node root;
    public void insert(int newData){
        root = insert(root,newData);
    }
    public Node insert(Node node,int newData){
        if(node==null){
            node = new Node(newData);
            return node;
        }
        else{
            if(newData<node.data)
                node.left = insert(node.left, newData);
            else if(newData>node.data)
                node.right = insert(node.right, newData);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        int bf = bFactor(node);
        if(bf>1 && newData<node.left.data)
            return rRotation(node);
        if(bf<-1 && newData>node.right.data)
            return lRotation(node);
        if(bf>1 && newData>node.left.data){
            node.left = lRotation(node.left);
            return rRotation(node);
        }
        if(bf<-1 && newData<node.right.data){
            node.right = rRotation(node.right);
            return lRotation(node);
        }
        
        return node;
    }
    public int height(Node node){
        if(node==null)
            return 0;
        return node.height;
    }
    public int bFactor(Node node){
        if(node==null)
            return 0;
        return height(node.left) - height(node.right);
    }
    public Node rRotation(Node c){
        Node b = c.left;
        Node T3 = b.right;

        b.right = c;
        c.left = T3;

        c.height = Math.max(height(c.left),height(c.right))+1;
        b.height = Math.max(height(b.left),height(b.right))+1;
        return b;

    }
    public Node lRotation(Node c){
        Node b = c.right;
        Node T3 = b.left;

        b.left = c;
        c.right = T3;

        c.height = Math.max(height(c.left),height(c.right))+1;
        b.height = Math.max(height(b.left),height(b.right))+1;
        return b;
    }
    public void print(){
        System.out.println("inorder");
        inorder(root);
        System.out.println();
        System.out.println("preorder");
        preorder(root);
        System.out.println();
        System.out.println("postorder");
        postorder(root);
        System.out.println();
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
    public void preorder(Node root){
        if(root==null)
            return;
        else{
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
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
