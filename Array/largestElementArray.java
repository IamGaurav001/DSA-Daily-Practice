import java.util.Arrays;

public class largestElementArray {
    public static void main(String[] args) {
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The Largest element in the array is: " + findLargest(arr1));
       
        int arr2[] =  {8,10,5,7,9};
        System.out.println("The Largest element in the array is: " + findLargest(arr2));
    }

    static int findLargest(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}