public class Patternno2 {
    public static void main(String[] args) {
        pat(5);

    }

    static void pat(int n){
        for(int row =0;row<=n;row++) {
            for(int col=0;col<=3;col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
