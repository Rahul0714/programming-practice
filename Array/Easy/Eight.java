import java.util.*;
//8) Sort 0s,1s,and 2s wihtout using sorting algorithm.
//This is variation of Dutch national flag Problem(3 way partition).
public class Eight {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        int low = 0,mid = 0,high = n-1,temp;
        while(mid<=high){
            if(arr[mid]==0){
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
                //continue;
            }
            else if(arr[mid]==1){
                mid++;
                //continue;
            }
            else if(arr[mid]==2){
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
                //continue;
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}