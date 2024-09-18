public class skip {
    public static void main(String[] args) {
        String input = "collegecolg and school subscribe tocolg universitycolg iscolg mandatory incolg todayscolg worldcolg";
        String toskip = "colg";
        String result = Skip(input, toskip);
        System.out.println(result);
    }

    public static String Skip(String input, String toskip) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i <= input.length() - toskip.length()) {

            if (input.substring(i, i + toskip.length()).equals(toskip)) {
                i += toskip.length();
            } else {
                result.append(input.charAt(i));
                i++;
            }
        }


        result.append(input.substring(i));

        return result.toString();
    }
}
