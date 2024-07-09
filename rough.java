
import java.util.Scanner;
public class rough {
    static int[] display(int rows,int col,int[][]a){
        int[] sum=new int[rows];
        for (int i=0;i<rows;i++){
            int x=0;
            for (int j=0;j<col;j++){
                x+=a[i][j];
            }
            sum[i]=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int rows=scanner.nextInt();
        int col=scanner.nextInt();
        int [][] a=new int[rows][col];
        for (int i=0;i<rows;i++){
            for (int j=0;j<col;j++){
                a[i][j]=scanner.nextInt();
            }
        }
        scanner.close();
        int[] sum=display(rows,col,a);
        for(int x:sum){
            System.out.print(x+"");
        }

        
    }
    
}
