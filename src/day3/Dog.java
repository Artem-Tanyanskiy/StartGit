package day3;

public class Dog {
    String name;
    String say;

    public static void main(String[] args) {
        Dog s = new Dog();
        Dog f = new Dog();
        s.name = "spot";
        s.say =  "gav";
        f.name = "scruffy";
        f.say = "rrrr";
        System.out.println("Dog name " + s.name + " say " + s.say);
        System.out.println("Dog name " + f.name + " say " + f.say);

        Dog Test = new Dog();
        s = Test;
        System.out.println("\t Test");
        System.out.println(s==Test);
        System.out.println(s.equals(Test));
    }

}
