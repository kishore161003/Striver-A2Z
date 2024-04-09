public class pattern8 {
      public static void nStarTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<(2*n)-(i+1);j++){
                if(j<i){
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
        nStarTriangle(3);
    }
}
