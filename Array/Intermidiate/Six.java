import java.util.*;
//6) Sort an Array using Quicksort algorithm.
class Six{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        Sort(arr,0,n-1);
        for(int ch:arr)
        System.out.print(ch+" ");
        sc.close();
    }
    public static void Sort(int arr[],int low,int high){
        if(low<high){
            int pi = Partition(arr,low,high);
            Sort(arr,low,pi-1);
            Sort(arr,pi+1,high);
        }
    }
    public static int Partition(int arr[],int low,int high){
        int i = low-1;
        int temp =0, pivot = arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
}