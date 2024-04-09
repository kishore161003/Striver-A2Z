// search the position to Insert Target Element in Sorted Array
public class problem5 {
    public static int searchInsert(int[] arr, int x) {
        // Write your code here.
        int lo = 0, hi = arr.length - 1;
        int lb = arr.length;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr[mid] >= x) {
                hi = mid - 1;
                lb = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lb;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 2));
    }
}
