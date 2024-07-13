package Objectlcloning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
//        Clone luffy = new  Clone(19, "luffy", "Sencho");
//        Clone puffy = new Clone(luffy);
////        puffy.name = "dusra_luffy";
//        Clone zuffy  = new Clone();
//        zuffy.age = 22;
//        zuffy.name = "zuffy";
//        zuffy.job = "null";
//
//        Clone fuffy =  (Clone)luffy.clone();
//        System.out.println(fuffy.name);
//        System.out.println(luffy.name);
//        System.out.println(puffy.name);

        Clone roro = new Clone(21, "Zoro", "Swordsman");
//        System.out.println(roro.age);
        //shadow cloning
        Clone brook =(Clone)roro.clone();
        brook.job= "do ntihing";
//        System.out.println(brook.job);
//        System.out.println(roro.job);
//        System.out.println(Arrays.toString(roro.arr));
//        brook.arr[2] = 3;
//        System.out.println(Arrays.toString(brook.arr));
//        Clone chopper =  (Clone)roro.deepclone();
//        System.out.println(Arrays.toString(chopper.arr));
//        chopper.arr[4] = 345;
//        System.out.println(Arrays.toString(chopper.arr));
//        System.out.println(Arrays.toString(roro.arr));
//        brook.arr[4] = 99;
//        System.out.println(Arrays.toString(brook.arr));
//        System.out.println(Arrays.toString(roro.arr));
//        System.out.println();
//        System.out.println(Arrays.toString(roro.arr));
//        brook.arr[4] =909;
//        System.out.println(Arrays.toString(brook.arr));

        //deep cloning
        System.out.println(Arrays.toString(roro.arr));
        Clone chopper = (Clone)roro.deepclone();
        System.out.println(Arrays.toString(chopper.arr));
        chopper.arr[4] = 987;
        System.out.println(Arrays.toString(chopper.arr));
        System.out.println(Arrays.toString(roro.arr));

    }
}
