
import java.util.*;
public class rough {
    static int[] reverse(int n,int[] a){
        int[] b=new int[n];
        int x=n-1;
        int i=0;
        while (x>=0){
            b[i]=a[x];
            x--;
            i++;
        }
        
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] ans=reverse(n,a);
        for (Integer r:ans){
            System.out.print(r+" ");
        }
    }
    
}
