//  binary search
public class problem1 {

    public static int search(int[] nums, int target) {
        // Write your code here.
        int n = nums.length;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = (int) lo + ((hi - lo) / 2);
            if (nums[mid] < target) {
                lo = mid + 1;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        search(new int[]{ 7, 8, 12, 34, 42 }, 3);
    }
}