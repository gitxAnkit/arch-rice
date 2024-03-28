
//import java.io.*;
import java.util.*;

public class classesAndObjects {

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
        p1.saysHi();

        Person p2 = new Person();
        p2.age = 23;
        p2.name = "L Jackson";
        p2.saysHi(); // p1,p2,p3 stores adrress of
                     // here p1 p2 and p3 are refrences to instance/object
                     // age, name are instance
        Person p3 = p2;
        p3.saysHi();
    }
}