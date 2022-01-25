//Since, Java array implements the Cloneable interface, we can create the clone of the Java array. If we create the clone of a single-dimensional array, it creates the deep copy of the Java array. It means, it will copy the actual value. But, if we create the clone of a multidimensional array, it creates the shallow copy of the Java array which means it copies the references.

import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    int[] arr1 = {1,2,3,4,5};
	    System.out.println("Original array is : ");
	    for(int i : arr1){
	        System.out.println(i);
	    }
		int[] arr2= arr1.clone();
		System.out.println("Cloned array is : ");
		for(int i : arr2){
	        System.out.println(i);
	    }
	    System.out.println("Are both equal ? ");
	    System.out.println(arr1==arr2);
	    
	}
}
