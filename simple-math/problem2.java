// reverse the number
public class problem2 {
    public static int reverse(int n){
        // Write your code here.
        int reversed = 0;
        while(n != 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1234578));
    }
}
