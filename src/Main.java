import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	  // Initialize an integer array
	  int[] arr = new int[]{1, 2, 3, 4, 7, 8,3, 2,1, 0, 5, 6, 5};
	    
	  // Store the length of the array in the variable n
	  int n = arr.length;
	    
	  // Initialize a temporary variable to store values during swapping
          int temp = 0;
        
          // Loop through the array with the outer loop
          for (int i = 0; i < n; i++) {
            // Loop through the array with the inner loop
            for (int j = 1; j < (n - i); j++) {
              // Compare the current and previous elements, swap if necessary
              if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
             }
          }
        
          // Print the sorted array using the Arrays.toString method
          System.out.print(Arrays.toString(arr));

   }
}
