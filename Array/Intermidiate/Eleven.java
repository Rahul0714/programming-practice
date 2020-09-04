/*import java.util.*;

public class Eleven {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        int low =0,high =n-1,temp =0;
        while(low<high){
            if(arr[low]<0)
            low++;
            else if(arr[low]>0){
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        for(int ch:arr)
        System.out.print(ch+" ");
        sc.close();
    }    
}
*/
//Nahh...!! This was Separating negative and positive part of array.

import java.util.*;
//11) Rearrange the array in alternating positive and negative items with O(1) extra space.
class Eleven{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}

