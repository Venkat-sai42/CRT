public class Array1 {
// Java program for creating an array and prints each value to standard output.
    public static void main(String[] args)
    {
        // declares an Array of integers.
        int[] arr = {10,20,30,40,50};

        // accessing the elements of the array
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
            System.out.println();
        for (int i = arr.length - 1 ; i >= 0 ; i--){
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
    }
}

