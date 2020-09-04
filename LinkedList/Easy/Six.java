import java.util.*;
public class Six {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        linkList ll = new linkList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            ll.addElement(sc.nextInt());
        ll.createCircular();
        sc.close();
    }
}

class linkList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void addElement(int newData){
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
    public void createCircular(){
        System.out.println("welcome");
        Node temp = head;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = head;
        Node a = head;
        while(a!=null){
            System.out.println(a.data);
            a = a.next;
        }
    }
}