import java.util.*;
public class BoubbleSort {
    static int[] display(int n,int[] a){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (a[j]>a[i]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        
        return a;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int[] ans=display(n,a);
        for (int r:ans){
            System.out.print(r+" ");
        }
        
    }
}
