public class binary {
    public static void main(String[] args) {
        String str = "0101??01?";
        convert(str,"");

    }

    public static String convert(String str, String pro) {
        StringBuilder result = new StringBuilder();
        if(str.isEmpty()) {
            result.append(pro);
            System.out.println(result);
            return result.toString();
        }
        String left = "";
        String right = "";
        String rem = "";
        char ch = str.charAt(0);
        if(ch=='?') {
            left = convert(str.substring(1), pro + '1');


            right = convert(str.substring(1), pro + '0');
        }

        if(ch!='?') {
        rem=    convert(str.substring(1), pro+ch);
        }

        StringBuilder final_result = new StringBuilder();
        final_result.append(left);
        final_result.append(right);
        final_result.append(rem);

        return final_result.toString();





    }
}
