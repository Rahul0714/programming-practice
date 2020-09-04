import java.util.*;
public class Two {
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);
        binarySearchTree bst = new binarySearchTree();
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
            bst.insertNode(sc.nextInt());
        bst.print();
        bst.deletion(sc.nextInt());
        bst.print();
        bst.search(sc.nextInt());
        System.out.println("is BST: "+bst.isBst());
        //bst.findSuccPre(sc.nextInt());
        System.out.println("Min: "+bst.min());
        System.out.println("Min: "+bst.max());
        bst.rootToLeaves();
        sc.close();
    }
}

class binarySearchTree{
    class Node{
        int data;
        Node left;
        Node right;
        int hd;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
            hd = 0;
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
        else{
            if(newData<=node.data)
                node.left = insertNode(node.left, newData);
            else
                node.right = insertNode(node.right, newData);
        }
        return node;
    }
    public void print(){
        System.out.println("Inorder Traversal");
        Inorder(root);
        System.out.println();
        System.out.println("Preorder Traversal");
        Preorder(root);
        System.out.println();
        System.out.println("Postorder Traversal");
        Postorder(root);
        System.out.println();
        System.out.println("Level-Order Traversal");
        levelorder(root);
    }
    public void Inorder(Node node){
        if(node==null)
            return;
        else{
            Inorder(node.left);
            System.out.print(node.data+" ");
            Inorder(node.right);
        }
    }
    public void Preorder(Node node){
        if(node==null)
            return;
        else{
            System.out.print(node.data+" ");
            Preorder(node.left);
            Preorder(node.right);
        }
    }
    public void Postorder(Node node){
        if(node==null)
            return;
        else{
            Postorder(node.left);
            Postorder(node.right);
            System.out.print(node.data+" ");
        }
    }
    public void levelorder(Node node){
        if(node==null)
            return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.print(tempNode.data+" ");
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
    }
    public void deletion(int dData){
        root = deletion(root,dData);
    }
    public Node deletion(Node node,int dData){
        if(node==null)
            return node;
        if(dData<node.data)
            node.left = deletion(node.left,dData);
        else if(dData>node.data)
            node.right = deletion(node.right,dData);
        else{
            if(node.left==null)
                return node.right;
            else if(node.right==null)
                return node.left;
            
            node.data = minVal(node.right);
            node.right = deletion(node.right,node.data);
        }
        return node;
    }
    static int minVal(Node node){
        int min = node.data;
        while(node.left!=null){
            min = node.left.data;
            node = node.left;
        }
        return min;
    }
    public void search(int sData){
        System.out.print(search(root,sData)?"Found\n":"Not Found\n");
    }
    public boolean search(Node node,int sData){
        if(node==null)
            return false;
        if(sData<node.data)
            return search(node.left,sData);
        else if(sData>node.data)
            return search(node.right,sData);
        else if(sData==node.data)
            return true;
        else
            return false;
    }
    public String isBst(){
        return isBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE)?"Yes":"No";
    }
    public boolean isBst(Node node,int min,int max){
        if(node==null)
            return true;
        if(node.data<min && node.data>max)
            return false;
        return (isBst(node.right,node.data+1,max) && isBst(node.left,min,node.data-1));
    }
    public int min(){
        return min(root);
    }
    public int min(Node node){
        if(node==null)
            return -1;
        while(node.left!=null)
            node = node.left;
        return node.data;
    }
    public int max(){
        return max(root);
    }
    public int max(Node node){
        if(node==null)
            return -1;
        while(node.right!=null)
            node = node.right;
        return node.data;
    }
    public void rootToLeaves(){
        int paths[] = new int [100];
        rootToLeaves(root,paths,0);
    }
    public void rootToLeaves(Node node,int paths[],int pathLength){
        if(node==null)
            return;
        paths[pathLength++] = node.data;
        
        if(node.left==null && node.right==null)
            printArray(paths,pathLength);
        else{
            rootToLeaves(node.left,paths,pathLength);
            rootToLeaves(node.right,paths,pathLength);
        }
    }
    public void printArray(int arr[], int len){
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}


// inorder successor and predecessor.