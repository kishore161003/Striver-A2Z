
//Search in Rotated Sorted Array
import java.util.ArrayList;

public class problem8 {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr.get(mid) == k)
                return mid;
            else if (arr.get(lo) <= arr.get(mid)) {
                if (arr.get(lo) <= k && k <= arr.get(mid)) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (arr.get(mid) <= k && k <= arr.get(hi)) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        System.out.println(search(arr, 7, 0));
    }

}
