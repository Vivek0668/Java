public class countVowels {
    public static void main(String[] args) {
        System.out.println(count("aeiou"));

    }

    public static int count(String input) {
        if(input.isEmpty()) {
            return 0;
        }
        int i=0;
        int count =0;
        while(i<input.length()) {
            if(input.charAt(i) == 'a'  ) {
                count++;

            }
            if(input.charAt(i) == 'e'  ) {
                count++;

            }
            if(input.charAt(i) == 'i'  ) {
                count++;

            }
            if(input.charAt(i) == 'o'  ) {
                count++;

            }
            if(input.charAt(i) == 'u'  ) {
                count++;

            }
            i++;


        }
        return count;
    }
}
