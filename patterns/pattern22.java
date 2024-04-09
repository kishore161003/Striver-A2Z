public class pattern22 {
     public static void getNumberPattern(int n) {
        // Write your code here.
        for(int i=1;i<=(2*n)-1;i++){
            for(int j=1;j<=(2*n)-1;j++){
                int x = Math.abs(i - n );
                int y = Math.abs(j - n );
                int currCell = (int)Math.max(x, y) +1;
                System.out.print(currCell);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        getNumberPattern(5);
    }
    
}
