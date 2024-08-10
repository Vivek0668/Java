public class Main {
    public static void main(String[] args) {
        System.out.println(str());



        }
    static boolean str() {
        String name = "aAbBCc";
        char ch = name.charAt(0);
        for (int i = 0; i <name.length() ; i++) {
            if(ch== name.charAt(1)) {
                return true;

            }

        }
        return false;



    }
}