public class BinaryisPalin {
    public static void main(String[] args) {
        System.out.println(isPalin(7));

    }

    public static boolean isPalin(int n) {
        String binaryNumber = Integer.toBinaryString(n);
        int start = 0;
        int end = binaryNumber.length()-1;
        while(start<end) {
            char left = binaryNumber.charAt(start);
            char right = binaryNumber.charAt(end);
            if(left!= right) {
                return false;
            }
                start++;
                end--;


        }
        return true;


    }
}
