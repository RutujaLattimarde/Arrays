//Program to find the sum of all the elements of an array

import java.util.*;
public class Main{
    public static int sum(int arr[], int n){
        int sum =0;
        for(int i=0; i<n ; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum is : "+sum(arr, n));
    }
}
