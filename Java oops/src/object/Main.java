package object;

public class Main {
    public static void main(String[] args) {
        Object obj = new Object(0, "Kirmada");
        System.out.println(obj.hashCode());

        Object obj2 = new Object(7, "Jogo");
        System.out.println(obj2.hashCode());

        System.out.println(obj instanceof Object);
        System.out.println(obj.getClass().getName());


    }

}
