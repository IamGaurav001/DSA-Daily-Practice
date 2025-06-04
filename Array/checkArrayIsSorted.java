public class checkArrayIsSorted {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(check(nums));
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(check(nums2));
    }

    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) count++;
            if (count > 1) return false;
        }
        if (count == 1 && nums[n - 1] > nums[0]) return false;
        return true;
    }
}