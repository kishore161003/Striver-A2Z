// floor and ceil of x
public class problem4 {
    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
        // Wriute your code here.
        int lb = -1;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr[mid] <= x) {
                lb = arr[mid];
                lo = mid + 1;

            } else {
                hi = mid - 1;
            }
        }

        int ub = -1;
        lo = 0;
        hi = n - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr[mid] >= x) {
                ub = arr[mid];
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return new int[] { lb, ub };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 };
        int x = 5;
        int[] res = getFloorAndCeil(arr, arr.length, x);
        System.out.println(res[0] + " " + res[1]);
    }
}
