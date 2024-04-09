// min element in a rotated sorted array
public class problem10 {
    public static int findMin(int[] arr) {
        // Write your code here.
        int lo = 0, hi = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr[lo] <= arr[mid]) {
                ans = Math.min(arr[lo], ans);
                lo = mid + 1;
            } else {
                ans = Math.min(arr[mid], ans);
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[] { 4, 5, 6, 7, 0, 1, 2 }));
    }
}
