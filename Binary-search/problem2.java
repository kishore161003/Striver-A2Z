// lowerBound() function to find the lower bound of a given element in a sorted array.
public class problem2 {
    public static void lowerBound() {
        int[] arr = { 1, 2, 3, 3, 3, 4, 5 };
        int n = arr.length;
        int x = 3;
        int lo = 0, hi = n - 1;
        int lb = n;

        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr[mid] >= x) {
                lb = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(lb);
    }

    public static void main(String[] args) {
        lowerBound();
    }
}
