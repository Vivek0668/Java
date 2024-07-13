import java.sql.SQLOutput;

public class Inheritence {

    public static void main(String[] args) {
        Box obj = new Box(55,94,2);

//        System.out.println(obj.height);
//        System.out.println(obj.width);
//        System.out.println(obj.length);
        Box obj2 = new Box(obj);
//        System.out.println(obj2.height);
//        System.out.println(obj2.width);
//        System.out.println(obj2.length);
//      Box1 obj3 = new Box1(77,44,55,2);
//        System.out.println(obj3.height);
//        System.out.println(obj3.width);
//        System.out.println(obj3.length);
//        System.out.println(obj3.weight);


 Boxweight objj = new Boxweight(4,5,3,7);
        System.out.println(objj.height);
        System.out.println(objj.length);
        System.out.println(objj.width);
        System.out.println(objj.weight);
    }
}

class Box1 extends Box {
    double weight ;


    public Box1(int length, int height, int width, double weight) {
//        super(length, height, width);
//        super.height = height;
//        super.length = length;
//        super.width = width;
        super(height,length,width);


        this.weight = weight;
    }
}

class Boxweight extends Box  {
    double weight ;

    Boxweight(int length,int height,int width,double weight) {
        super(height,width,length);
        this.weight = weight;

    }


}
