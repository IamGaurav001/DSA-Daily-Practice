public class selectionSort {
    static void selection_sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String args[]){
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selection_sort(arr, n);
    }
}

// Time Complexity: O(n^2)
// Space Complexity: O(1)
// This code implements the selection sort algorithm in Java.
// It sorts an array of integers in ascending order.
// The selection sort algorithm works by repeatedly finding the minimum element from the unsorted part of the array
// and swapping it with the first unsorted element.
// The main method initializes an array, prints it before sorting, calls the selection_sort method,
// and then prints the sorted array.
// The selection_sort method takes an array and its length as input.
// It uses two nested loops: the outer loop iterates through the array,
// while the inner loop finds the index of the minimum element in the unsorted part.
// After finding the minimum element, it swaps it with the first unsorted element.