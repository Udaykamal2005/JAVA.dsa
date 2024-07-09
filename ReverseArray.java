import java.util.*;

public class ReverseArray{
    static void reva(int n,int[] a){
        n=n-1;
        while (n>=0){
            System.out.print(a[n]+" ");
            n-=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int [n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        reva(n,a);
        
    }
    
        
}
