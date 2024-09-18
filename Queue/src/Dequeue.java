import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {

        Deque<Integer> deck = new ArrayDeque<>();
        deck.add(88);
        deck.addFirst(9);
        deck.addLast(909);
        deck.add(728);
        deck.add(9290);
        deck.add(255);
        deck.add(88);

//        deck.remove(88);
        System.out.println(deck);
        deck.removeFirst();
        System.out.println(deck);
        deck.removeFirstOccurrence(88);
        System.out.println(deck);



    }


}

