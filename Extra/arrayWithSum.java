// import java.util.*;
// class arrayWithSum{
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int q=0;q<num;q++){
//             int n = sc.nextInt();
//             int sum = sc.nextInt();
//             int arr[] = new int[n];
//             for(int i=0;i<n;i++)
//             arr[i] = sc.nextInt();
//             int curr_sum =0;
//             boolean check = false;
//             for(int i=0;i<n;i++){
//                 curr_sum = arr[i];
//                 for(int j=i+1;j<n+1;j++){
//                     if(curr_sum>sum)
//                     break;
//                     else if(curr_sum==sum){
//                         int end = j-1;
//                         System.out.println(i+" "+end);
//                         check =true;
//                         break;
//                     }
//                     curr_sum += arr[j];
//                 }
//                 if(check)
//                     break;
//             }
//             if(!check)
//                 System.out.println("No Such SubArray!");
//         }
//         sc.close();
//     }
// }
//O(n^2)

import java.util.*;
class arrayWithSum{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int q=0;q<num;q++){
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
            int curr_sum =0,start =0;
            for(int i=0;i<n;i++){
                while(curr_sum>sum && start<i-1){
                    curr_sum = curr_sum -arr[start];
                    start++;
                }
                if(curr_sum==sum){
                    int end = i-1;
                    System.out.println(start+" "+end);
                    break;
                }
                if(i<n)
                    curr_sum += arr[i];
            }
        }
        sc.close();
    }
}