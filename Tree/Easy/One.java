import java.util.*;
public class One {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        binaryTree bt = new binaryTree();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            bt.insertNode(sc.nextInt());
        bt.print();
        System.out.println();
        System.out.println("Enter data of node to delete");
        bt.deletion(sc.nextInt());
        bt.print();
        System.out.println("\nEnter data to search");
        bt.searchValue(sc.nextInt());
        System.out.println("Height Of Binary Tree: "+bt.height());
        System.out.println("Diameter Of Binary Tree: "+bt.diameter());
        System.out.println("Mirror of Tree");
        bt.mirror();
        bt.print();
        bt.checkBalanced();
        bt.min();
        bt.max();
        sc.close();
    }
}

class binaryTree{
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
        root = insertNode(root,newData,0);
    }
    public Node insertNode(Node node,int newData,int hDist){
        if(node==null){
            node = new Node(newData);
            node.hd = hDist;
            return node;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            if(tempNode.left==null){
                tempNode.left = insertNode(tempNode.left,newData,tempNode.hd-1);
                break;
            }
            else  
                queue.add(tempNode.left);
            if(tempNode.right==null){
                tempNode.right = insertNode(tempNode.right,newData,tempNode.hd+1);
                break;
            }
            else   
                queue.add(tempNode.right);
        }
        return node;
    }
    public void print(){
        System.out.println("Tree in Inorder!");
        Inorder(root);
        System.out.println("\nLevel-wise");
        levelOrder(root);
        System.out.println("\nTree in Reverse Level-wise!");
        rLevelOrder(root);
        System.out.println("\nTree in Preorder!");
        Preorder(root);
        System.out.println("\nTree in Postorder!");
        Postorder(root);
    }
    public void Inorder(Node node){
        if(node==null)
            return;
        else{
            Inorder(node.left);
            System.out.print(node.data+"("+node.hd+")"+" ");
            Inorder(node.right);
        }
    }
    public void Preorder(Node node){
        if(node==null)
            return;
        else{
            System.out.print(node.data+"("+node.hd+")"+" ");
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
            System.out.print(node.data+"("+node.hd+")"+" ");
        }
    }
    public void deletion(int dData){
        deletion(root,dData);
    }
    public void deletion(Node node,int dData){
        if(node==null)
            return;
        boolean check = false;
        Queue<Node> queue = new LinkedList<Node>();
        Node dNode = null;
        Node tempNode = null;
        queue.add(root);
        while(!queue.isEmpty()){
            tempNode = queue.poll();
            if(tempNode.data==dData){
                dNode = tempNode;
                check = true;
            }
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
        if(!check){
            System.out.println("\"ohh!!wth!You've made boo-boo\"");
            return;
        }
        int x = tempNode.data;
        node = deleteDeepest(node,tempNode);
        dNode.data = x;
    }
    public Node deleteDeepest(Node node,Node tempNode){
        if(node==null)
            return node;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node tNode = queue.poll();
            if(tNode.right!=null){
                if(tNode.right==tempNode){
                    tNode.right = null;
                    tempNode = null;
                    break;
                }
                else
                    queue.add(tNode.right);
            }
            if(tNode.left!=null){
                if(tNode.left==tempNode){
                    tNode.left = null;
                    tempNode = null;
                    break;
                }
                else
                    queue.add(tNode.left);
            }
        }
        return node;
    }
    public void levelOrder(Node node){
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
    public void rLevelOrder(Node node){
        if(node==null)
            return;
        Queue<Node> queue = new LinkedList<Node>();
        Stack<Node> stack = new Stack<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            stack.push(tempNode);
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
        while(!stack.empty()){
            System.out.print(stack.peek().data+" ");
            stack.pop();
        }
    }
    public void searchValue(int value){
        searchValue(root,value);
    }
    public void  searchValue(Node node,int value){
        if(node==null)
            return;
        Queue<Node> queue = new LinkedList<Node>();
        boolean check = false;
        queue.add(node);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            if(tempNode.data==value)
                check = true;
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
        if(check)
            System.out.println("Found!!");
        else   
            System.out.println("Aghrr!! Not Found!");
    }
    public int height(){
        return height(root);
    }
    public int height(Node node){
        if(node==null)
            return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
    public int diameter(){
        return diameter(root);
    }
    public int diameter(Node node){
        if(node==null)
            return 0;
        
        int lheight = height(node.left);
        int rheight = height(node.right);

        int ldiameter = diameter(node.left);
        int rdiameter = diameter(node.right);

        return Math.max((lheight+rheight+1),Math.max(ldiameter,rdiameter));
    }
    public void mirror(){
        mirror(root);
    }
    public void mirror(Node node){
        if(node==null)
            return;
        
        mirror(node.left);
        mirror(node.right);

        Node temp =null;
        temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
    public void checkBalanced(){
        System.out.println("\nBalanced: "+checkBalanced(root));
    }
    public boolean checkBalanced(Node node){
        if(node==null)
            return false;
        if(height(node.left)!=height(node.right))
            return false;
        int lh =0,rh =0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            lh =0;rh =0;
            Node tempNode = queue.poll();
            if(tempNode.left!=null)
                lh = height(tempNode.left);
            if(tempNode.right!=null)
                rh = height(tempNode.right);
            if(lh-rh<-1 && lh-rh>1)
                return false;
        }
        return true;
    }
    public void min(){
        System.out.println("Min: "+min(root));
    }
    public int min(Node node){
        if(node==null)
            return -1;
        int min  = node.data;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            if(tempNode.data<min)
                min = tempNode.data;
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
        return min;
    }
    public void max(){
        System.out.println("Max: "+max(root));
    }
    public int max(Node node){
        if(node==null)
            return -1;
        int max  = node.data;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            if(tempNode.data>max)
                max = tempNode.data;
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
        return max;
    }
}