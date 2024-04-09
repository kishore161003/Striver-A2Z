
//find first and last occurrence of a number in a sorted array
import java.util.ArrayList;

public class problem6 {
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int lo = 0, hi = n - 1;
        int lb = n;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr.get(mid) >= k) {
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
            if (arr.get(mid) > k) {
                hi = mid - 1;
                ub = mid;
            } else {
                lo = mid + 1;
            }
        }
        if (lb == n || arr.get(lb) != k)
            return new int[] { -1, -1 };
        return new int[] { lb, ub - 1 };

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int k = 8;
        int[] res = firstAndLastPosition(arr, arr.size(), k);
        System.out.println(res[0] + " " + res[1]);
    }
}
