import java.util.*;

public class sortHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        //first we will take the input from the

        // Taking input from the user
        System.out.println("Enter the number of key-value pairs:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter key " + (i + 1) + ":");
            String key = scanner.nextLine();
            System.out.println("Enter value " + (i + 1) + ":");
            int value = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            map.put(key, value);
        }

        // Sorting the HashMap by values
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        // Displaying the sorted HashMap
        System.out.println("HashMap sorted by values:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
