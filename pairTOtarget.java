
import java.util.*;

public class pairTOtarget{
    static void find(int n,int target,int[] a){
        for (int i=0;i<n-1;i++){
            for (int j=i+1;i<n;j++){
                if ((a[i]+a[j])==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new  Scanner (System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        find(n,target,a);
    }
    
}
