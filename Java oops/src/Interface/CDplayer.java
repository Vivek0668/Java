package Interface;

public class CDplayer implements  Media{
    @Override
    public  void start(){
        System.out.println("CD player started");

    }
@Override
    public void stop () {
        System.out.println("CD player stopped");
    }
}
