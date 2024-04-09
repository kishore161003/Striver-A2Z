public class pattern5 {
     public static void seeding(int n) {
        // Write your code here
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        seeding(4);
    }
    
}
