public class pattern11 {
      public static void nBinaryTriangle(int n) {
        // Write your code here.
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nBinaryTriangle(4);
    }
    
}
