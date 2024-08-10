package String;

public class Prac {
    public static void main(String[] args) {
        print('a');

    }

    static void print(char ans) {
        if(ans == 'f'){
            return;
        }

       char ch= (char)((ans+1));
       print(ch);

        System.out.println(ans);


    }
}
