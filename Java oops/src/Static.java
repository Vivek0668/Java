import java.util.Arrays;

public class Static {
    public static void main(String[] args) {
        Human chopper = new Human(18,"Tony", 20000);
        Human usopp = new Human(21, "Usopp",30000);
        System.out.println(chopper.age);
        System.out.println(Human.population);
//        int[] arr = new int[5];
//        int[] arr2 = {};
//        int[] arr3 = new int[]{4,4,53};

//        System.out.println(Arrays.toString(arr3));


    }
}

 class Human  {
    int age;
    String name ;
    int salary;
    //statc variable
     static int population ;


    Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population  += 1;


    }




}
