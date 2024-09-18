public class FirstAppearPalin {
    public static void main(String[] args) {

        String[] words = {"notappalindrome", "racecar"};
        System.out.println(firstPalin(words));

    }

    public static String firstPalin(String[] words) {
        int i=0;
        while(i<words.length) {
            if(isPalin(words[i])) {
                return words[i];
            }else {
                i++;
            }
        }
        return "";
    }

    public static boolean isPalin(String s) {
        int start=0;
        int end = s.length()-1;
        while(start<end) {
            char left = s.charAt(start);
            char right= s.charAt(end);
            if(left!= right) {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
