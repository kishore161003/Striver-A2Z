/**
 * Armstrong Number
 */
public class problem5 {

    public static boolean isArmstrong(int n){
        // Write your code here.
        int temp = n;
        int sum = 0;
        int digits = (int)Math.log10(n)+1;
        while(n != 0){
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return temp == sum;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    
}