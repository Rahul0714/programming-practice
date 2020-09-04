/*import java.util.*;
public class LargestEvenNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int q=0;q<n;q++){
            String numString = sc.next();
            String []ans = new String[numString.length()];
            int arr[] = new int[10];
            arr = fillArray(numString);
            int j=0;
            for(int i=0;i<10;i+=2){
                if(arr[i] >0){
                    ans[numString.length()-1] = Integer.toString(i);
                    arr[i]--;
                    break;
                }
            }
            for(int i=9;i>=0;i--){
                if(arr[i]>0 && ans[j]==null){
                    ans[j++] = Integer.toString(i);
                    arr[i]--;
                }
                if(arr[i]>0)
                    i++;
            }
            for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]);
            }
        sc.close();
        }
    static int[] fillArray(String numString){
        int brr[] = new int[10];
        for(int i=0;i<numString.length();i++){
            brr[Character.getNumericValue(numString.charAt(i))]++;
        }
        return brr;
    }
}
*/
//Another Approach

import java.util.*;
public class LargestEvenNumber{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int q=0;q<n;q++){
            String number = sc.next();
            int arr[] = new int[number.length()];
            int ans[] = new int[number.length()];
            for(int i=0;i<number.length();i++){
                arr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
            }

            Arrays.sort(arr);
            for(int i=0;i<number.length();i++){
                if(arr[i]%2==0){
                    ans[number.length()-1] = arr[i];
                    arr[i] = -1;
                    break;
                }
            }
            int j =0;
            for(int i=number.length()-1;i>=0;i--){
                if(arr[i]!=-1){
                    ans[j++] = arr[i];
                }
            }
            for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]);
            System.out.println();
        }
        sc.close();
    }
}