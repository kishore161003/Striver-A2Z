public class pattern0 {
    public static void nForest(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(j>i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nForest(4);
    }
}
