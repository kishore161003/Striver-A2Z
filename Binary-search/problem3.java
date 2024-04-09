// upperBound() function to find the upper bound of a given element in a sorted array.
import java.util.Scanner;

public class problem3 {
    static Scanner sc = new Scanner(System.in);

    public static void upperBound() {

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();

        int lo = 0;
        int hi = n - 1;
        int ub = n;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr[mid] <= x) {
                lo = mid + 1;
            } else {
                ub = mid;
                hi = mid - 1;
            }
        }
        System.out.println(ub);
    }

    public static void main(String[] args) {
        upperBound();
    }
}
