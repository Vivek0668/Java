import java.util.*;

public class sortByValueusingHashMap {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        HashMap<String,Integer> hashMap = new HashMap<>();

        // first create a new hashmap

        System.out.println("Enter the number of key-value pairs :");
        int n = sc.nextInt();
        sc.nextLine();
        //then we will take the input from the user
        for(int i =0;i<n ;i++) {
            System.out.println("Enter the key" +(i+1) + ":");
            String key =  sc.nextLine();
            System.out.println("Enter value " + (i+1) + ":");
            int value =sc.nextInt();
            sc.nextLine();
            hashMap.put(key, value);

        }

        //now sorting the hashmap by values
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(Map.Entry.comparingByValue());

        //now we will display the sorted hashmap
        System.out.println("Hashmap sorted by values:");
        for(Map.Entry<String, Integer> entry: list) {
            System.out.println(entry.getKey() + " : " +entry.getValue()) ;
        }
    }
}
