public class bubbleSort {
    static void bubble_sort(int arr[], int n){
        for (int i=n-1; i>0; i--){
            for (int j =0; j<=i-1; j++){
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); 
        }
    }
    // static void bubble_sort(int[] arr, int n) {
    //     for (int i = n - 1; i >= 0; i--) {
    //         for (int j = 0; j <= i - 1; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }

    //     System.out.println("After bubble sort: ");
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }
    public static void main(String args[]) {
            int arr[] = {13, 46, 24, 52, 20, 9};
            int n = arr.length;
            System.out.println("Before Using Bubble Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            bubble_sort(arr, n);
    }
}

// Time Complexity: O(n^2)
// Space Complexity: O(1)
// This code implements the bubble sort algorithm in Java.
// It sorts an array of integers in ascending order.
// The bubble sort algorithm works by repeatedly stepping through the list,
// comparing adjacent elements and swapping them if they are in the wrong order.
// The pass through the list is repeated until the list is sorted.
// The main method initializes an array, prints it before sorting, calls the bubble_sort method,
// and then prints the sorted array.
// The bubble_sort method takes an array and its length as input.
// It uses two nested loops: the outer loop iterates through the array,
// while the inner loop compares adjacent elements and swaps them if they are in the wrong order.
// The process continues until no swaps are needed, indicating that the array is sorted.
