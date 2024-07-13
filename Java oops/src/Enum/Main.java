package Enum;

public class Main {

    public static void main(String[] args) {
        enum Week {
            Monday,Tuesday, Wednesday, Thursday, Friday, Saturday;

            Week() {
                System.out.println("Constructor calling " + this);
            }
        }

        Week week;
        for(Week day : Week.values()) {
            System.out.println(day);

        }

    }
}
