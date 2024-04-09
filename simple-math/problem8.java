// check if a number is a prime number or not
public class problem8 {
    public static boolean isPrime(int n){
        // Write your code here.
        if(n<=1) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }
    
}
