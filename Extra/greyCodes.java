import java.util.*;
class greyCodes{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n(greater than equal to 3)");
        int n = sc.nextInt();
        generateCodes(n);
        sc.close();
    }
    static void generateCodes(int num){
        if(num<=2)
            return;
        int n =0;
        if(num>0 && num<4){
            for(int i=0;i<=7;i++){
                int arr[] =new int[num];
                int j =num-1;
                n = i;
                while(n!=0){
                    arr[j--] = n%2;
                    n /=2;
                }
                int ans[] = new int[num];
                for(int k=num-1;k>0;k--){
                    ans[k] = arr[k] ^ arr[k-1];
                }
                ans[0] = arr[0];
                for(int ch:ans)
                    System.out.print(ch);
                    System.out.println();
        }
    }
        else{
        for(int i=(int)Math.pow(2,(num-1));i<(int)Math.pow(2,num);i++){
            int arr[] =new int[num];
            int j =num-1;
            n = i;
            while(n!=0){
                arr[j--] = n%2;
                n /=2;
            }
            int ans[] = new int[num];
            for(int k=num-1;k>0;k--){
                ans[k] = arr[k] ^ arr[k-1];
            }
            ans[0] = arr[0];
            for(int ch:ans)
                System.out.print(ch);
                System.out.println();
            }  
        }
    }
}