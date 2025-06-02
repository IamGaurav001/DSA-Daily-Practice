public class quickSort {
    // Partition function to place the pivot element at the correct position
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++; // Increment index of smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }

    // Main quicksort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find pivot element such that elements smaller than pivot are on the left
            // and elements greater than pivot are on the right
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

//Time Complexity: O(n log n) on average, O(n^2) in the worst case
//Space Complexity: O(log n) due to recursive stack space
//Stable: No, quicksort is not a stable sort
//In-place: Yes, quicksort is an in-place sorting algorithm
//Best for: Large datasets where average-case performance is more important than worst-case performance
//Worst for: Datasets that are already sorted or nearly sorted, as it can degrade to O(n^2)
//Usage: Commonly used in practice for its efficiency and simplicity