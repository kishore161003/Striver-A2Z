public class problem11 {
    public static int findKRotation(int[] arr) {
        // Write your code here.
        int lo = 0, hi = arr.length - 1;
        int ansInd = -1;
        int ans = Integer.MAX_VALUE;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr[lo] <= arr[mid]) {
                if (ans > arr[lo]) {
                    ans = arr[lo];
                    ansInd = lo;
                }
                lo = mid + 1;
            } else {
                if (arr[mid] < ans) {
                    ans = arr[mid];
                    ansInd = mid;
                }
                hi = mid - 1;
            }
        }
        return ansInd;
    }

    public static void main(String[] args) {
        System.out.println(findKRotation(new int[] { 4, 5, 6, 7, 0, 1, 2 }));
    }
}
