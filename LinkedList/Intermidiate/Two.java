//2) Write a Program to check whether the Singly Linked list is a palindrome or not.
import java.util.*;
class Two{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        list ll = new list();
        int num = sc.nextInt();
        for(int q=0;q<num;q++){
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                ll.insertNode(sc.nextInt());
            System.out.println(ll.checkPalindrome());
        }
        sc.close();
    }
}

class list{
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
    public boolean checkPalindrome(){
        if(head==null)
            return false;
        else{
            Node temp = head.next;
            Node prev = head;
            while(temp.next!=null&&prev.data!=temp.data){
                temp = temp.next;
            }
            if(temp.data!=prev.data)
                return false;
            while(temp!=null){
                System.out.println(temp.data+" "+prev.data);
                if(temp.data!=prev.data)
                    return false;
                temp = temp.next;
                prev = prev.next;
            }
            return true;
        }
    }
}