
// find the peak element in an array. A peak element is an element that is greater than or equal to its neighbors.
import java.util.ArrayList;

public class problem13 {
    public static int findPeakElement(ArrayList<Integer> arr) {
        // Write your code here.
        if (arr.size() == 1)
            return arr.get(0);
        if (arr.get(0) > arr.get(1))
            return 0;
        if (arr.get(arr.size() - 1) > arr.get(arr.size() - 2))
            return arr.size() - 1;
        int lo = 1, hi = arr.size() - 2;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr.get(mid) > arr.get(mid + 1) && arr.get(mid) > arr.get(mid - 1))
                return mid;
            else if (arr.get(mid) > arr.get(mid - 1)) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(findPeakElement(arr));
    }
}
