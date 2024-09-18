public class findithBit {
    public static void main(String[] args) {
        PrintIthBit(22,3);


    }

    public static void PrintIthBit(int n,int bit){

     int result = ( n & (1<<(bit-1)));
     System.out.println("Binary representation of the result: " + Integer.toBinaryString(result));


    }
}
