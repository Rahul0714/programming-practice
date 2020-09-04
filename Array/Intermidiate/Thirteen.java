/*import java.util.*;

//13) Find Largest sum contiguous Subarray.
public class Thirteen {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
            int meh =0,msf =(int)-10e7,max =msf;
            boolean check =false;
            for(int i=0;i<n;i++){
                if(max<arr[i])
                max =arr[i];
                if(arr[i]>=0)
                check =true;
            }
            if(!check){
            System.out.println(max);
            continue;
            }
            for(int i=0;i<n;i++){
                meh +=arr[i];
                if(meh<arr[i])
                meh =arr[i];
                if(msf<meh)
                msf =meh;
            }
            System.out.println(msf);
        }
        sc.close();
    }
}
*/
//Kadane's Algorithm (don't know not accepted TLE)(Modified for both pos and neg).
//Another one simple only for positive numbers.
/*
import java.util.*;

class Thirteen{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
            int meh =0,msf =0;
            for(int ch:arr){
                meh +=ch;
                if(meh<ch)
                meh =ch;
                if(msf<meh)
                msf =meh;
            } 
            System.out.println(msf);
        }
        sc.close();
    }
}
*/
import java.util.*;

class Thirteen{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
            int msf =arr[0];
            int curr_max =arr[0];
            for(int i=1;i<n;i++){
                curr_max = Math.max(arr[i],(curr_max)+arr[i]);
                msf = Math.max(msf,curr_max);
            }
            System.out.println(msf);
        }
        sc.close();
    }
}
//again....