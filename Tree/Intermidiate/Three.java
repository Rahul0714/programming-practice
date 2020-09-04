import java.util.*;
public class Three {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        binaryTree2 bt2 = new binaryTree2();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            bt2.insertNode(sc.nextInt());
        bt2.levelOrder();
        sc.close();
    }
}

class binaryTree2{
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
    public void levelOrder(){
        levelOrder(root);
    }
    public void levelOrder(Node node){
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();
        s1.push(node);
        while(!s1.empty()||!s2.empty()){
            while(!s1.empty()){
                Node tempNode = s1.pop();
                System.out.print(tempNode.data+" ");
                if(tempNode.right!=null)
                    s2.push(tempNode.right);
                if(tempNode.left!=null)
                    s2.push(tempNode.left);
            }
            while(!s2.empty()){
                Node tempNode = s2.pop();
                System.out.print(tempNode.data+" ");
                if(tempNode.left!=null)
                    s1.push(tempNode.left);
                if(tempNode.right!=null)
                    s1.push(tempNode.right);
            }
        }
    }
}




// if(node==null)
//             return;
//         Queue<Node> queue = new LinkedList<Node>();
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         queue.add(node);
//         queue.add(null);
//         while(!queue.isEmpty()){
//             Node tempNode = queue.peek();
//             if(tempNode!=null){
//                 System.out.print(tempNode.data+" ");
//             while(queue.peek()!=null){
//                 if(arr.size()%2==0){
//                 if(tempNode.left!=null)
//                     queue.add(tempNode.left);
//                 if(tempNode.right!=null)
//                     queue.add(tempNode.right);
//                 }
//                 else{
//                     if(tempNode.right!=null)
//                     queue.add(tempNode.right);
//                 if(tempNode.left!=null)
//                     queue.add(tempNode.left);
//                 }
//                 queue.remove();
//                 tempNode = queue.peek();
//                 }
//             queue.add(null);
//             }
//         queue.remove();
//         arr.add(1);
//         }
//     }