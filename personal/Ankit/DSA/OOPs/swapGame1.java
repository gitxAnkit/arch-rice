public class swapGame1 {

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
         * -> Before swapping
         * 
         * Samuel[8] says hi
         * L Jackson[23] says hi
         * 
         * -> After swapping
         * 
         * Samuel[8] says hi
         * L Jackson[23] says hi
         */
        // Here no changes happend because p1 and p2 are only refrences
        // after swapping only refrences swapped not actual value
    }

    public static void swap(Person psn1, Person psn2) {
        Person temp = psn1;
        psn1 = psn2;
        psn2 = temp;
    }
}
