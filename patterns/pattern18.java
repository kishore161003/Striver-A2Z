public class pattern18 {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            char p=(char)('A'+n-1);
            for(int j=0;j<=i;j++){
                System.out.print(p-- +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphaTriangle(4);
    }
}
