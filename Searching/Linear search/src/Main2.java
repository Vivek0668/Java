import java.util.Scanner;

public class Main2 {
    //in this linear search it returnn the element you searched rather than index

    public static void main(String[] args) {
        int [] array = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Array elements : ");
        for(int i=0;i<array.length;i++) {
            array[i]= input.nextInt();
        }
        System.out.print("Enter the element you want to search : ");

        int element = input.nextInt();

        Linear(array,element);

    }

    static int Linear(int[] array, int target) {
        if(array.length==0) {
            return -1;
        }

        for(int element : array) {
            if(element == target) {
                System.out.print("The element " + element + " is found");
                return element;
            }
        }
        System.out.println("Element doesnt exist");
        return -1;

    }
}
