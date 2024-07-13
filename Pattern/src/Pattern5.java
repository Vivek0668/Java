public class Pattern5 {
    public static void main(String[] args) {
        pat(4);
        
    }
    
    static void pat(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int colno = i>n ? 2 *n -i: i;
            for (int j = 0; j < colno ; j++) {
                System.out.print(" * ");

            }
            System.out.println();
            
        }
       



            

    }
}
