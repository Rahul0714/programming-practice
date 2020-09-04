import java.util.*;
public class Nine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        binaryTree8 bt8 = new binaryTree8();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            bt8.insertNode(sc.nextInt());
        bt8.treeToDll();
        sc.close();
    }
}

class binaryTree8{
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
    class dll{
        int value;
        dll prev;
        dll next;
        dll(int value){
            this.value = value;
            prev = null;
            next = null;
        }
    }
    Node root;
    dll head;
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
    public void treeToDll(){
       dll head = treeToDll(root);
       dll temp = head;
       System.out.println("Sultadll");
       while(temp!=null){
        System.out.print(temp.value+" ");
        temp = temp.next;
        }
        System.out.println("\nUlta dll");
        temp = head;
        while(temp.next!=null)
            temp = temp.next;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.prev;
        }
    }
    public dll treeToDll(Node node){
            if(node==null)
                return null;
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(node);
            while(!queue.isEmpty()){
                Node tempNode = queue.poll();
                if(head==null){
                    dll newNode = new dll(tempNode.data);
                    newNode.next = null;
                    newNode.prev = null;
                    head = newNode;
                }
                else{
                    dll newNode = new dll(tempNode.data);
                    dll last = head;
                    while(last.next!=null)
                        last = last.next;
                    last.next = newNode;
                    newNode.prev = last;
                    newNode.next = null;
                }
                if(tempNode.left!=null)
                    queue.add(tempNode.left);
                if(tempNode.right!=null)
                    queue.add(tempNode.right);
            }
            return head;
        }
    }