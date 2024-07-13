package Interface;

public class Nested {
    public interface NestedInteface{
        boolean isOdd(int num);
    }
}

class b implements Nested.NestedInteface {
    @Override
  public  boolean isOdd(int num) {

        return (num & 1)==1;
    }
}
