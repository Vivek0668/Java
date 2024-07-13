import java.util.Arrays;

public class Javaclass {
    public static void main(String[] args) {
        Student  sanji = new Student();
        //fizzy approach  to add values
         sanji.age = 22;
         sanji.name =  "cOOK";
         sanji.marks = 89.77f;

//        System.out.println(sanji.name);
//        System.out.println(sanji.age);
//        System.out.println(sanji.marks);
        //optimal approach to add  value to the object
        Student roro = new Student(22,"zoro", 89.78f);
//        System.out.println(roro.name);
//        System.out.println(roro.age);
//        System.out.println(roro.marks);
//        roro.greet();

        Student vice_cap = new  Student(roro);
        System.out.println(vice_cap.name);
        System.out.println(vice_cap.age);
        System.out.println(vice_cap.marks);

        vice_cap.greet();




    }







}
class  Student  {
    int age ;
    String name ;
    float marks;

    Student(int age, String name, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks ;

    }
    Student() {
    }


   void greet() {
       System.out.println("Hello my name is " + this.name+ " and i am " + this.age + " years old");


    }
    Student(Student other){
        this.name = other.name;
        this.age =other.age;
        this.marks =  other.marks;

    }



}
