public class pattern7 {
     public static void nStarTriangle(int n) {
        // Write your code here
        for(int i =0;i<n;i++){
            for(int j=0;j<(n+i);j++){
                if(j<(n-i-1)){
                System.out.print(" ");
                continue;
            }
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        nStarTriangle(3);
    }
}
