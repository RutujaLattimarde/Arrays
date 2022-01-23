// Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.

public class Main{
    
    static void anonymous_arr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        anonymous_arr(new int[]{10,20,30});
    } 
    }
