import java.util.*;
public class Main{
    public static void main(String[] args){
        //int m,n,p,q;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of 1st matrix");
        int m = sc.nextInt();
        System.out.println("Enter the number of cols of 1st matrix");
        int n = sc.nextInt();
        System.out.println("Enter the number of rows of 2nd matrix");
        int p = sc.nextInt();
        System.out.println("Enter the number of cols of 2nd matrix");
        int q = sc.nextInt();
        
        if(m==p && n==q){
            int a[][] = new int[m][n];
            int b[][] = new int[p][q];
            int c[][] = new int[m][q];
        
            System.out.println("Enter the elements of 1st matrix");
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements of 2nd matrix");
            for(int i=0; i<p; i++){
                for(int j=0; j<q; j++){
                    b[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("The resultant matrix is : ");
            for(int i=0; i<m; i++){
                for(int j=0; j<q; j++){
                    for(int k=0; k<n; k++)
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            for(int i=0; i<m; i++){
                for(int j=0; j<q; j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println(" ");
            }
        } 
        else{
            System.out.println("Addition is not possible");
        }
    }
}
