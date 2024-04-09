// Gcd of Two numbers
public class problem4 {
    public static int gcd(int a, int b){
        // Write your code here.
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(12, 15));
    }
}
