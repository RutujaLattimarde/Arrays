// Program to find the minimum and maximum element in the array

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the size of array");
	     int n = sc.nextInt();
	     int[] arr = new int[n];
	     System.out.println("Enter array elements");
	     for(int i=0; i<n; i++){
	         arr[i] = sc.nextInt();
	     }
	     int min = arr[0];
	     for(int i=0; i<n; i++){
	         if(min > arr[i]){
	             min = arr[i];
	         }
	     }
	     System.out.println("Min element is :"+min);
	     int max = arr[0];
	     for(int j=0; j<n; j++){
	         if(max < arr[j]){
	             max = arr[j];
	             }
	     }
	     System.out.println("Max element is :"+max);
	}
}
