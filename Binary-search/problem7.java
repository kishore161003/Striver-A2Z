// count the number of occurrences of a number in a sorted array
public class problem7 {
    public static int count(int arr[], int n, int k) {
        int lo = 0, hi = n - 1;
        int lb = n;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr[mid] >= k) {
                hi = mid - 1;
                lb = mid;
            } else {
                lo = mid + 1;
            }
        }
        lo = 0;
        hi = n - 1;
        int ub = n;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr[mid] > k) {
                hi = mid - 1;
                ub = mid;
            } else {
                lo = mid + 1;
            }
        }
        if (lb == n || arr[lb] != k)
            return 0;
        return ub - lb;

    }

    public static void main(String[] args) {
        System.out.println(count(new int[] { 1, 2, 3, 3, 3, 3, 4, 5 }, 8, 3));
    }
}
