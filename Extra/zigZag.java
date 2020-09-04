import java.util.*;
class zigZag{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int mid = (n-1)/2;
        int temp = arr[n-1];
        arr[n-1] = arr[mid];
        arr[mid] = temp;
        int start = mid+1;
        int end = n-1;
        while(start<=end){
            if(arr[start]<arr[end]){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;            
            }
            end--;
        }
        for(int ch:arr)
        System.out.print(ch);
        sc.close();
    }
}