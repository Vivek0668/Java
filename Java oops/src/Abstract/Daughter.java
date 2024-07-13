package Abstract;

public class Daughter extends Parent {

    @Override
    void career() {
        System.out.println("I want to become a doctor");

    }
    @Override
    void partner() {
        System.out.println("I want to date eren");
    }

   Daughter(int data) {
       super(data);


   }
    @Override
    void age() {
        System.out.println("The age of the daughter is " + super.age);
    }


}
