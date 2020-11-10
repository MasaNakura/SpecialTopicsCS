import java.util.*;

public class SortingAlgorithms {
    // test algorithms
   public static void main(String[] args) {
      int[] nothing = {};
      int[] one = {1};
      int[] test1 = {3, 1, 3, 6, -2, 5, 0, 8, -5};
      int[] test2 = {0, 3 , 4, 2, 1, -1, 10, -8, -7};
      int[] test3 = {356, 234, -133, 349, -938, 342, -323, 34, -2};
      // run selection sort
      selectionSort(nothing);
      selectionSort(one);
      selectionSort(test1);
      // check selection sort
      System.out.println(Arrays.toString(nothing));
      System.out.println(Arrays.toString(one));
      System.out.println(Arrays.toString(test1));
      // run insertion sort
      insertionSort(nothing);
      insertionSort(one);
      insertionSort(test2);
      // check insertion sort 
      System.out.println(Arrays.toString(nothing));
      System.out.println(Arrays.toString(one));
      System.out.println(Arrays.toString(test2));
      // run bubble sort
      bubbleSort(nothing);
      bubbleSort(one);
      bubbleSort(test3);
      // check bubble sort
      System.out.println(Arrays.toString(nothing));
      System.out.println(Arrays.toString(one));
      System.out.println(Arrays.toString(test3));
   }
   
   public static void selectionSort(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         int minimum = arr[i];
         int minIndex = i;
         for (int j = i; j < arr.length; j++) {
            if (minimum > arr[j]) {
               minimum = Math.min(minimum, arr[j]);
               minIndex = j;
            }
         }
         int temp = arr[i];
         arr[i] = arr[minIndex];
         arr[minIndex] = temp;
      }
   }
   
   public static void bubbleSort(int arr[]) {
      int n = arr.length;  
      int temp = 0;  
      for(int i=0; i < n; i++){  
         for(int j=1; j < (n-i); j++){  
            if(arr[j-1] > arr[j]){  
               // swap int
               temp = arr[j-1];  
               arr[j-1] = arr[j];  
               arr[j] = temp;  
            }  
                          
         }  
      }
   }
   
   public static void insertionSort(int[] input){
      int temp;
      for (int i = 1; i < input.length; i++) {
         for(int j = i ; j > 0 ; j--){
            if(input[j] < input[j-1]){
               temp = input[j];
               input[j] = input[j-1];
               input[j-1] = temp;
            }
         }
      }
   }
}
