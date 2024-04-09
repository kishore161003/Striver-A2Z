public class pattern16 {
     public static void alphaRamp(int n) {
        // Write your code here
        char p = 'A';
        for(int i=0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(p+" ");
            }
            p++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphaRamp(4);
    }
}
