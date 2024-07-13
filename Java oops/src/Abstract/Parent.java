package Abstract;

public abstract class Parent {
    int age ;

    Parent(int age) {
        this.age = age;

    }
   public static void hello() {
        System.out.println("hey");
    }
    abstract void age();
  abstract   void career();
  abstract void partner();
}
