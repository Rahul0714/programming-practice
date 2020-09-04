import java.util.*;
public class Two {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();
        System.out.println("How many elements");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.addElements(sc.nextInt());
        }
        System.out.println("Enter Element to be searched");
        int element = sc.nextInt();
        ll.Search(element);
        sc.close();
    }
}

class linkedlist{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void addElements(int newData){
        if(head==null){
            Node newNode = new Node(newData);
            newNode.next = null;
            head = newNode;
        }
        else{
            Node last = head;
            while(last.next!=null)
                last = last.next;
            Node newNode = new Node(newData);
            newNode.next = null;
            last.next = newNode;
        }
    }
    public void Search(int element){
        Node temp = head;
        boolean check = false;
        while(temp!=null){
            if(temp.data==element)
            check = true;
            temp = temp.next;
        }
        if(check)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}