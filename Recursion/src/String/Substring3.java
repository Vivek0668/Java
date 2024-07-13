    package String;

    public class Substring3 {
        public static void main(String[] args) {
         String ans=   skipFruit("banana_appleisloove");
    //        System.out.println(ans);
            String choice = "apple";
            String ans2= skipYourchoice( "my fav fruit is " + choice , choice);
            System.out.println(ans2);

        }

        static String skipFruit(String que) {
            if(que.isEmpty()){
                return "";
            }


            if(que.startsWith("apple")) {
                return skipFruit(que.substring(5));

            }else {

                return que.charAt(0) + skipFruit(que.substring(1));
            }
        }
        static  String skipYourchoice(String que,String choice) {
            if(que.isEmpty()) {
                return "";
            }


            if(que.startsWith(choice)) {
                int no = choice.length();
                return skipYourchoice(que.substring(no), choice);
            }else {
                return  que.charAt(0) + skipYourchoice(que.substring(1), choice);
            }
        }


    }


