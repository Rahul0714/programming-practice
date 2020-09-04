import java.util.*;
public class One {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        binaryTree bt = new binaryTree();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            bt.insertNode(sc.nextInt());
        bt.print();
        bt.leftViewr();
        bt.leftViewi();
        bt.rightViewr();
        bt.rightViewi();
        bt.topView();
        bt.bottomView();
        sc.close();
    }
}

class binaryTree{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
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
                tempNode.right = insertNode(tempNode.right, newData);
                break;
            }
            else
                queue.add(tempNode.right);
        }
        return node;
    }
    public void print(){
        System.out.println("Preorder");
        Preorder(root);
        System.out.println();
        System.out.println("Inorder");
        Inorder(root);
        System.out.println();
        System.out.println("Postorder");
        Postorder(root);
        System.out.println();
        System.out.println("level-order");
        levelOrder(root);
        System.out.println();
        System.out.println("reverse-level-order");
       rLevelOrder(root);
        System.out.println();
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
    public void Inorder(Node node){
        if(node==null)
            return;
        else{
            Inorder(node.left);
            System.out.print(node.data+" ");
            Inorder(node.right);
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
        while(!stack.empty())
            System.out.print(stack.pop().data+" ");
    }
    int maxLevell = 0;
    public void leftViewr(){
        System.out.println("Left View(Recursively)");
        leftViewr(root,1);
        System.out.println();
    }
    public void leftViewr(Node node,int level){
        if(node==null)
            return;
        if(maxLevell<level){
            System.out.print(node.data+" ");
            maxLevell = level;
        }
            leftViewr(node.left,level+1);
            leftViewr(node.right,level+1);
    }
    int maxLevelr = 0;
    public void rightViewr(){
        System.out.println();
        System.out.println("Right View(Recursively)");
        rightViewr(root,1);
        System.out.println();
    }
    public void rightViewr(Node node,int level){
        if(node==null)
            return;
        if(maxLevelr<level){
            System.out.print(node.data+" ");
            maxLevelr = level;
        }
        rightViewr(node.right,level+1);
        rightViewr(node.left,level+1);
    }
    public void leftViewi(){
        leftViewi(root);
    }
    public void leftViewi(Node node){
        if(node==null)
            return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        queue.add(null);
        while(!queue.isEmpty()){
            Node tempNode = queue.peek();
            if(tempNode!=null){
                System.out.print(tempNode.data+" ");
            while(queue.peek()!=null){
                if(tempNode.left!=null)
                    queue.add(tempNode.left);
                if(tempNode.right!=null)
                    queue.add(tempNode.right);
                queue.remove();
                tempNode = queue.peek();
            }
            queue.add(null);
        }
        queue.remove();
    }
}
    public void rightViewi(){
        rightViewi(root);
    }
    public void rightViewi(Node node){
        if(node==null)
            return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i=1;i<=n;i++){
                Node tempNode = queue.poll();
            if(i==n)
                System.out.print(tempNode.data+" ");
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
            }
        }
    }
    public void topView(){
        System.out.println();
        System.out.println("Top View");
        topView(root);
        System.out.println();
    }
    public void topView(Node node){
        class queueObj{
            Node node;
            int hd;
            queueObj(Node node,int hd){
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<queueObj> queue = new LinkedList<queueObj>();
        Map<Integer,Node> map = new TreeMap<Integer,Node>();
        if(node==null)
            return;
        else{
            queue.add(new queueObj(node, 0));
            }
        while(!queue.isEmpty()){
            queueObj tempNode= queue.poll();
            if(!map.containsKey(tempNode.hd))
                map.put(tempNode.hd,tempNode.node);
            if(tempNode.node.left!=null)
                queue.add(new queueObj(tempNode.node.left,tempNode.hd-1));
            if(tempNode.node.right!=null)
                queue.add(new queueObj(tempNode.node.right, tempNode.hd+1));
        } 
        for(Map.Entry<Integer,Node> entry:map.entrySet())
            System.out.print(entry.getValue().data+" ");
    }
    public void bottomView(){
        System.out.println("Bottom View");
        bottomView(root);
        System.out.println();
    }
    public void bottomView(Node node){
        class queueObj{
            Node node;
            int hd;
            queueObj(Node node,int hd){
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<queueObj> queue = new LinkedList<queueObj>();
        Map<Integer,Node> map = new TreeMap<Integer,Node>();
        if(node==null)
            return;
        else{
            queue.add(new queueObj(node,0));
        }
        while(!queue.isEmpty()){
            queueObj tempNode = queue.poll();
            if(!map.containsKey(tempNode.hd))
                map.put(tempNode.hd, tempNode.node);
            map.put(tempNode.hd, tempNode.node);
            if(tempNode.node.left!=null)
                queue.add(new queueObj(tempNode.node.left,tempNode.hd-1));
            if(tempNode.node.right!=null)
                queue.add(new queueObj(tempNode.node.right,tempNode.hd+1));
        }
        for(Map.Entry<Integer,Node> entry: map.entrySet())
            System.out.print(entry.getValue().data+" ");
    }
}