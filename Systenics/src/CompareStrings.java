public class CompareStrings {
    public static void main(String[] args) {
        System.out.println(compareTo("asach","value"));

    }

    public static boolean compareTo(String one ,String two) {
        if(one.length() != two.length()) {
            return false;
        }
        int i=0;
        while(i<one.length()) {
            if(one.charAt(i) != two.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
