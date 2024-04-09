// check palindrome number
public class problem3 {
    
    public static boolean isPalindrome(int n){
        // Write your code here.
        int reversed = 0;
        int temp = n;
        while(n != 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return temp == reversed;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
