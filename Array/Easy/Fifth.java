import java.util.*;
//5)Sort array.
public class Fifth {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        Selection(arr);
        Bubble(arr);
        sc.close();
    }    
    static void Bubble(int arr[]){  //O(n^2)
        System.out.println("\nBubble Sort");
        int len = arr.length;
        int temp;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void Selection(int arr[]){   //O(n^2)
        System.out.println("Selection Sort");
        int len = arr.length;
        int min_idx,temp;
        for(int i=0;i<len-1;i++){
            min_idx = i;
            for(int j=i+1;j<len;j++)
                if(arr[j]<arr[min_idx])
                    min_idx = j;
                temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
        }
    for(int i=0;i<len;i++){
        System.out.print(arr[i]+" ");
    }
}
}