//1) Write a program to get the “Nth”Node from the end of the Singly Linked List.
import java.util.*;
class One{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        llist ll = new llist();
        for(int q=0;q<num;q++){
            int n = sc.nextInt();
            int pos = sc.nextInt();
            int realPos = n-pos;
            for(int i=0;i<n;i++)
                ll.insertNode(sc.nextInt());
            System.out.println(ll.searchNode(realPos));
        }
        sc.close();
    }
}

class llist{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void insertNode(int newData){
        if(head==null){
            Node newNode = new Node(newData);
            newNode.next = null;
            head = newNode;
        }
        else{
            Node newNode = new Node(newData);
            Node last = head;
            while(last.next!=null)
                last = last.next;
            newNode.next = null;
            last.next = newNode;
        }
    }
    public int searchNode(int data){
        if(data<=0)
            return -1; 
        else{
            Node temp = head;
            int count =0;
            while(temp!=null&&count!=data){
                temp = temp.next;
                count++;
            }
            return temp.data;
        }
    }
}
