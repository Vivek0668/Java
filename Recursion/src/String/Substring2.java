package String;

public class Substring2 {
    public static void main(String[] args) {
        System.out.println(skip("abhas"));

    }

    static String skip(String modify){
        if(modify.isEmpty()) {
            return "";
        }

        char ch = modify.charAt(0);
        if(ch== 'a') {
           return skip(modify.substring(1));

        }else {
//            String final_ans =//
//          return final_ans;
            return ch +  skip(modify.substring(1));

        }
    }
}
