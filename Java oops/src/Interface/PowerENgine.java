package Interface;

public class PowerENgine implements Engine {
    @Override
    public void start() {
        System.out.println("PowerEngine started");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stopped");
    }
}
