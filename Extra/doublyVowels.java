import java.util.*;
public class doublyVowels {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        llist ll = new llist();
        int m = sc.nextInt();
        for(int i=0;i<m;i++)
            ll.insert(sc.next().charAt(0));
        ll.deleteVowels();
        ll.print();
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
    public void insert(int newData){
        if(head==null){
            Node newNode = new Node(newData);
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
        }
        else{
            Node newNode = new Node(newData);
            Node last = head;
            while(last.next!=null)
                last = last.next;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = null;
        }
    }
    public void print(){
        Node temp = head;
        boolean check = false;
        while(temp!=null){
            System.out.print((char)temp.data+" ");
            temp = temp.next;
            check = true;
        }
        if(!check)
            System.out.println("Oops!! everything is deleted!");
    }
    public void deleteVowels(){
        int count =0;
        Node t = head;
        while(t!=null){
            t = t.next;
            count++;
        }
        while(count>0){
            if(head==null)
                return;
        if(head.data=='a'||head.data=='e'||head.data=='i'||head.data=='o'||head.data=='u'){
            Node temp = head;
            head = temp.next;
            temp.prev = null;
            count--;
        }
        else{
            Node prevTem = head;
            Node temp = head;
            while(temp!=null&&temp.data!='a'&&temp.data!='e'&&temp.data!='i'&&temp.data!='o'&&temp.data!='u'){
                prevTem = temp;
                temp = temp.next;
            }
            if(temp==null)
                return;
            prevTem.next = temp.next;
            temp.prev = null;
            if(temp.next!=null)
                temp.next.prev = temp.prev;
        }
    }
}
}