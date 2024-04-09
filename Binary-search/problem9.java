// Problem: Search in Rotated Sorted Array II which contains duplicates
public class problem9 {
    public static boolean searchInARotatedSortedArrayII(int[] A, int key) {
        // Write your code here.
        int lo = 0, hi = A.length - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (A[mid] == key)
                return true;
            else if (A[lo] == A[mid] && A[mid] == A[hi]) {
                lo++;
                hi--;
            } else if (A[mid] <= A[hi]) {
                if (A[mid] <= key && key <= A[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            } else {
                if (A[lo] <= key && key <= A[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return false;
    }
}
