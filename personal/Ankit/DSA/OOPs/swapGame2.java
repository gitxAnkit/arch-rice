
// import java.io.*;
import java.util.*;

public class swapGame2 {
    public static class Person {

        int age;
        String name;

        void saysHi() {
            System.out.println(name + "[" + age + "] says hi");
        }
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age = 8;
        p1.name = "    Samuel";

        Person p2 = new Person();
        p2.age = 23;
        p2.name = "L Jackson";

        p1.saysHi();
        p2.saysHi();
        swap(p1, p2);
        p1.saysHi();
        p2.saysHi();

        /*
         * Output
         * -> Before Swap
         * 
         * Samuel[8] says hi
         * L Jackson[23] says hi
         * 
         * ->After swap
         * 
         * L Jackson[23] says hi
         * Samuel[8] says hi
         */
        // Here values swapped because we swapped each instance instead of refrences
    }

    public static void swap(Person psn1, Person psn2) {
        int age = psn1.age;
        psn1.age = psn2.age;
        psn2.age = age;

        String name = psn1.name;
        psn1.name = psn2.name;
        psn2.name = name;
    }
}
