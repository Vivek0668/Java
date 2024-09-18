public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalin("abba"));

    }

    public static boolean isPalin(String input) {

        if(input.length()<2) {
            return true;
        }
        for(int i=0;i<input.length()/2;i++) {
            char left = input.charAt(i);
            char right = input.charAt(input.length()-1-i);
            if(left!= right) {
                return false;
            }
        }
        return true;
    }
}
