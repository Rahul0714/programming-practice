import java.util.*;

class One{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        createLinkedList cll = new createLinkedList();
        int ch =1,choice=0,n =0;
        while(ch!=0){
            System.out.println("Choices of Insertion\n1.Begin\n2.After some node\n3.End\n4.DeleteFirst\n5.delete\n6.Print");
            choice = sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Enter data");
                    n = sc.nextInt();
                    cll.insertAtBegin(n);
                    break;
                }
                case 2:{
                    System.out.println("Enter data");
                    n = sc.nextInt();
                    cll.insertAfterHead(cll.head,n);
                    break;
                }
                case 3:{
                    System.out.println("Enter data");
                    n = sc.nextInt();
                    cll.insertAtEnd(n);
                    break;
                }
                case 4:{
                    cll.deleteFirst();
                    break;
                }
                case 5:{
                    System.out.println("Enter element");
                    n = sc.nextInt();
                    cll.deleteAfter(n);
                    break;
                }
                case 6:{
                    cll.printList();
                    System.out.println();
                    break;
                }
            }
            System.out.println("Enter 0 to stop!");
            ch = sc.nextInt();
        }
        sc.close();
    }
}

class createLinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
        }
        public void insertAtBegin(int newData){
            Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;
        }
        public void insertAfterHead(Node prevNode,int newData){
            if(prevNode==null)
                System.out.println("Can't Insert");
            else{
                Node newNode = new Node(newData);
                newNode.next = prevNode.next;
                prevNode.next = newNode;
            }
        }
        public void insertAtEnd(int newData){
            if(head==null){
                head = new Node(newData);
                return;
            }
            Node newNode = new Node(newData);
            Node last = head;
            while(last.next!=null)
                last = last.next;
            newNode.next = null;
            last.next = newNode;
        }
        public void printList(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        public void deleteFirst(){
            if(head==null)
                System.out.println("Common man!! really?");
            else{
                Node temp = head;
                head = temp.next;
            }
        }
        public void deleteAfter(int data){
            if(head==null)
                System.out.println("Common man!! really?");
            else{
                Node temp = head;
                Node prev = head;
                while(temp!=null && temp.data!=data){
                    prev = temp;
                    temp = temp.next;
                }
                if(temp==null)
                return;
                prev.next = temp.next;
            }
        }
}