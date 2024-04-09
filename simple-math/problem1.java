// count the digits of a number
public class problem1 {
     public static int countDigits(int n){
        // Write your code here.
        return (int)Math.log10(n)+1;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(1234578));
    }
    
}
