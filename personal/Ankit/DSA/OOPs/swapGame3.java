public class swapGame3 {
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
         * 
         * Samuel[8] says hi
         * L Jackson[23] says hi
         * 
         * After Swap
         * 
         * Samuel[8] says hi
         * L Jackson[0] says hi
         */
        // here age of p2 becomes 0 because "psn2= new Person();" is used after swapping
        // age
    }

    public static void swap(Person psn1, Person psn2) {

        psn1 = new Person();// Keyword 'new' assigns a new refrence and makes integers values '0'
                            // and delets String values
        int age = psn1.age;
        psn1.age = psn2.age;
        psn2.age = age;

        psn2 = new Person();

        String name = psn1.name;
        psn1.name = psn2.name;
        psn2.name = name;
    }
}
