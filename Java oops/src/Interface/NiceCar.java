package Interface;

public class NiceCar {
    private Engine engine;
    private Media player = new CDplayer();

    public NiceCar() {
        this.engine = new PowerENgine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;

    }
    public void start() {
        engine.start();
    }

    public void stop () {
        engine.stop();

    }
    public void startmusic() {

       player.start();

    }
public void stopmusic() {
        player.stop();
}
public void UpgradeENgine() {
       engine = new ElectricEngine();
}

}


