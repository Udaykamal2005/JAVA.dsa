import java.util.*;

public class BinarySearch {
    static int dis(int n,int[] a,int x){
        int low=0,high=a.length,mid;
        while(low<=high){
            mid=(high+low)/2;
            if (a[mid]==x){
                return mid;
            }
            else if (a[mid]<x){
                low=mid-1;
            }
            else if(a[mid]>x){
                high=mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of elements in an array");
        int n=sc.nextInt();
        System.out.println("enter array of numbers");
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number u want to search");
        int x=sc.nextInt();
        int r=dis(n,a,x);
        System.out.println(r);
        
    }
    
}
