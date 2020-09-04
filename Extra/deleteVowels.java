import java.util.*;
public class deleteVowels {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int choice =1;
        char ch;
        while(choice!=0){
            System.out.println("Enter char");
            ch = sc.next().charAt(0);
            ll.addVowel(ch);
            //ll.deleteVowel();
            ll.showVowel();
            System.out.println();
            System.out.println("Enter 0 to break!");
            choice = sc.nextInt();
        }
        ll.deleteVowel();
        ll.showVowel();    
        sc.close();
    }
}

class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int newData){
            data = newData;
            next = null;
        }
    }
    public void addVowel(char vowel){
        if(head==null){
            Node newNode = new Node(vowel);
            newNode.next = null;
            head = newNode; 
        }
        else{
            Node newNode = new Node(vowel);
            Node last  =head;
            while(last.next!=null)
                last = last.next;
            last.next = newNode;
        }
    }
    public void showVowel(){
        Node temp = head;
        while(temp!=null){
            System.out.print((char)temp.data+" ");
            temp = temp.next;
        }
    }
    public void deleteVowel(){
        int i =0,size =0;
        Node temp1 =head;
        while(temp1!=null){
            temp1 = temp1.next;
            size++;
        }
        while(i<size){
        if(head.data=='a'||head.data=='e'||head.data=='i'||head.data=='o'||head.data=='u'){
            Node temp = head;
            head = temp.next;
            i++;
        }
        else{
            Node temp = head;
            Node prev = head;
        while(temp!=null&&(temp.data!='a'&&temp.data!='e'&&temp.data!='i'&&temp.data!='o'&&temp.data!='u')){
            prev = temp;
            temp = temp.next;   
        }
        if(temp==null){
            return;
        }
        prev.next = temp.next;
        temp=head;
        }    
    }
}
}