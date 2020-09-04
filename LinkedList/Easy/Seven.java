import java.util.*;
public class Seven {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        llist ll = new llist();
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
            ll.insertAtBegin(sc.nextInt());
        for(int i=0;i<t;i++)
            ll.insertAtEnd(sc.nextInt());
            
        ll.showFList();
        System.out.println();
        ll.showBList();
        sc.close();
    }
}

class llist{
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data = d;
            next = null;
            prev = null;
        }
     }
    public void insertAtBegin(int newData){
        if(head==null){
            Node newNode = new Node(newData);
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
        }
        else{
            Node newNode = new Node(newData);
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertAtEnd(int newData){
        Node temp = head;
        while(temp.next!=null)
            temp = temp.next;
        Node newNode = new Node(newData);
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
    }
    public void showFList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        } 
    }
    public void showBList(){
        Node temp = head;
        while(temp.next!=null)
            temp = temp.next;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.prev;
        }
}
}
