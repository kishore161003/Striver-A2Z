public class pattern9 {
     public static void nStarDiamond(int n) {
        for(int i =0;i<n;i++){
            for(int j=0;j<(n+i);j++){
                if(j<(n-i-1)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
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
        nStarDiamond(3);
    }

}
