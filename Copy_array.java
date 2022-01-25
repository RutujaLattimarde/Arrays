//We can copy an array to another by the arraycopy() method of System class.

import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    char[] arr1 = {'a','b','c','d','e','f'};
		char[] arr2 = new char[6];
		System.arraycopy(arr1,1,arr2,0,5);
		System.out.println(String.valueOf(arr2));
	}
}
