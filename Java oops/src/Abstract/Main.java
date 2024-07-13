package Abstract;

import static Abstract.Parent.hello;

public class Main  {
    public static void main(String[] args) {
        Son obj =  new Son(22) ;
        Daughter obj2 = new Daughter(24);

       hello();
       obj.career();
       obj.partner();

       obj2.career();
       obj2.partner();

       obj.age();
       obj2.age();


    }
}
