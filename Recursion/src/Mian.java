import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the task");
        String userInput = sc.next();

        String[] arr = {"task0", "task1", "task2", "task3", "task4", "task5"};

        Shubham(arr, userInput);
    }

    static void Shubham(String[] arr, String task) {
        int start = 0;
        int end = arr.length - 1;

        if (task.equals(arr[end])) {
            System.out.println(arr[start]);
        } else {
            for (int i = start; i <= end; i++) {
                if (task.equals(arr[i])) {
                    System.out.println(arr[i + 1]);
                    break;

                }
            }
        }
    }
}
