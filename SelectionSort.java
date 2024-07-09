import java.util.*;
public class SelectionSort {
    public static int[] Selectionsort(int n ,int[] a){
        for (int i=0;i<n;i++){
            int min=i;
            for (int j=i;j<n;j++){
                if (a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        return a;
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] ans=Selectionsort(n,a);
        for (Integer r:ans){
            System.out.print(r+" ");
        }
    }
}
