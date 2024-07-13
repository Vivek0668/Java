public class Pattern3 {
    public static void main(String[] args) {
        pat(5);
        
    }
    
    static void pat(int n) {
        for (int i = 0; i <=n ; i++) {
            for (int j =5; j>=i ; j--) {
                System.out.print(" * ");

            }
            System.out.println();

        }

    }
}
