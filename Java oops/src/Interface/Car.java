package Interface;

public class Car  implements Accelerate, Brake{

    @Override
    public  void brake() {
        System.out.println("i brake like a normal car");

    }

    @Override
    public void clutch() {
        System.out.println("i have a clutch like a normal car ");

    }

    @Override
    public void Speedup() {
        System.out.println("i speed up like a normal car");

    }

    @Override
    public void Speeddown() {
        System.out.println("i speed down like a normal car ");

    }
}
