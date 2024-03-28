public class constructors_and_this {

    public static class Person {

        int age;
        String name;

        void saysHi() {
            System.out.println(name + "[" + age + "] says Hi");
        }

        Person() {

        }

        Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age = 20;
        p1.name = "Mushashi Miyamoto";
        p1.saysHi();

        Person p2 = new Person(23, "Kojiro Sasaki");
        p2.saysHi();
    }
}
