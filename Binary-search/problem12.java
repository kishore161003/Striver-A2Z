
// find single element
import java.util.ArrayList;

public class problem12 {
    // public static int singleNonDuplicate(ArrayList<Integer> arr) {
    // // Write your code here.
    // int ans = 0;
    // for (Integer ele : arr) {
    // ans ^= ele;
    // }
    // return ans;
    // }

    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        // Write your code here.
        if (arr.size() == 1)
            return arr.get(0);
        if (arr.get(0) != arr.get(1))
            return arr.get(0);
        if (arr.get(arr.size() - 1) != arr.get(arr.size() - 2))
            return arr.get(arr.size() - 1);
        int lo = 1, hi = arr.size() - 2;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr.get(mid) == arr.get(mid - 1)) {
                if (mid % 2 == 1) {
                    lo = mid + 1;
                } else
                    hi = mid - 1;
            } else if (arr.get(mid) == arr.get(mid + 1)) {
                if (mid % 2 == 1) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                return arr.get(mid);
            }
        }
        return arr.get(lo);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(8);
        arr.add(8);
        System.out.println(singleNonDuplicate(arr));
    }
}
