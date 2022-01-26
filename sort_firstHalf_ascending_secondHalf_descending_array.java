//Java Code for Sorting first half in ascending order and second half in descending order

import java.util.*;
public class Main{
    
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("Output array is : ");
        for(int i=0; i<n/2; i++){
            System.out.print(arr[i]);
        }
        for(int i=n-1; i>=n/2; i--){
            System.out.print(arr[i]);
        }
    }
}
