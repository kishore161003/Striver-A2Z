public class pattern17 {
    public static void alphaHill(int n) {
        // Write your code here
        char p ='A';
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)(p+j) + " ");
            }
            for(int j=i-1;j>=0;j--){
                System.out.print((char)(p+j)+" ");
            }
             for(int j=i;j<n-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphaHill(3);
    }
    
}
