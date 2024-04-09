public class pattern14 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int p=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nNumberTriangle(4);
    }
}
