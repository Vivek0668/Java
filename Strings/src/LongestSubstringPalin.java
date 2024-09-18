public class LongestSubstringPalin {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ababa"));

    }

    public  static boolean isPalin(String s) {
        for(int i=0;i<s.length()/2;i++) {
            char left = s.charAt(i);
            char right = s.charAt(s.length()-1-i);
            if(left!= right) {
                return false;
            }
        }
        return true;
    }
    public  static String longestPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        StringBuilder first = new StringBuilder();
        StringBuilder second =new StringBuilder();
        while(left<s.length()){
            if(isPalin(s.substring(left))) {
                first.append(s.substring(left));
            }else {
                left++;
            }

        }
        while(right>0){
            if(isPalin(s.substring(right))) {
                second.append(s.substring(right));

            }else {
                right--;
            }

        }
        if(first.length()> second.length()) {
            return first.toString();
        }else {
            second.toString();
        }

        return"";


    }
}
