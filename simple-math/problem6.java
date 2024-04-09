import java.util.ArrayList;
import java.util.Collections;

public class problem6 {
    public static void allDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }

        }
        Collections.sort(divisors);
        for (Integer num : divisors) {
            System.out.print(num + " ");
        }
    }

    public static int sumofallDivisorupton(int n) {
        // 1 = 1
        // 2 = 2 + 1 =3
        // 3 = 3 + 1 =4
        // so answer would be 8
        // you will count the apperance of each number by dividing the n with i so that
        // appearance of i will avialble
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += n / i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        allDivisors(3);
        System.out.println("sum of all Divisors upto n " + sumofallDivisorupton(3));
    }
}
