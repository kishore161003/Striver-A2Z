public class pattern15 {

     public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            char start ='A';
            for(int j=i;j<n;j++){
                System.out.print(start++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nLetterTriangle(4);
    }
}
