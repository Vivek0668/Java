package String;


import java.util.ArrayList;


public class Arraysubsequence {
    public static void main(String[] args) {
     ArrayList<String> ans =   sub("","abc");
        System.out.println(sub("", "ban"));
        System.out.println(ans);


    }

    static ArrayList<String> sub(String pro, String unpro) {
        ArrayList<String> list = new ArrayList<>();


      if(unpro.isEmpty()) {
          list.add(pro);

          return list;


      }


        char ch = unpro.charAt(0);
        ArrayList<String> left = sub(pro+ch,unpro.substring(1));
        ArrayList<String> right = sub(pro, unpro.substring(1));


        left.addAll(right);
        return left;

    }
}
