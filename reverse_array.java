//Program to reverse all the elements of an array.

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
        System.out.println("Reverse of the array is : ");
        for(int i=n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
