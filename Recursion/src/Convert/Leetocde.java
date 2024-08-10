package Convert;

public class Leetocde {
    static String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    static String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public static void main(String[] args) {

    }
    public static String intTOwords(int num) {
        if(num==0) {
            return "Zero";
        }
        int i=0;
        String word ="";

        while(num>0) {
            if(num%1000!=0) {
                word = convert(num%1000) + THOUSANDS[i] + " " + word;
            }
            num/=1000;
            i++;
        }

        return word.trim();

    }

    public static String convert(int num) {
        String words = "";
        if(num==0) {
            return  "";
        }else if(num<20) {
            return LESS_THAN_20[num] + " ";
        }else if (num<100) {
            
        }
        return words;

    }


}

