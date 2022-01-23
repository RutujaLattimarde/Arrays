//We can pass the java array to method so that we can reuse the same logic on any array.

class Main{
    
    static void reverse_arr(int arr[]){
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int a[] = {10,20,30,40,50};
        reverse_arr(a);
    }
}
