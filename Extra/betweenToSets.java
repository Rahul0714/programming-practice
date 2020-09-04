import java.util.*;
public class betweenToSets {
    public static void main(String []agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[]  =new int[n];
        int arr2[] = new int[m];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        for(int i=0;i<m;i++)
            arr2[i] = sc.nextInt();
        int gcdElement =arr2[0];
        for(int i=1;i<m;i++)
            gcdElement = gcd(gcdElement,arr2[i]);
        int lcmElement = arr1[0];
            for(int i=1;i<n;i++)
            lcmElement = (lcmElement*arr1[i])/gcd(lcmElement,arr1[i]);
        int countElement =0;
        for(int i=lcmElement,j=2;i<=gcdElement;i=lcmElement*j,j++){
            if(gcdElement%i==0)
                countElement++;
        }
        System.out.println(countElement);
        sc.close();
    }
    
    private static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }    
}