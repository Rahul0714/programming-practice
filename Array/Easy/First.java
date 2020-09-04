//1)Create an Array of size 10 of integers.Take input from user for these 10 elements and print the entire array.

//import java.io.*;
import java.util.*;

class First{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter Elements");
        for(int i=0;i<10;i++)
        arr[i] = sc.nextInt();
        for(int i=0;i<10;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        sc.close();
    }
}