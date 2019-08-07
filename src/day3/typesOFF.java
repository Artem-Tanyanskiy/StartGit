package day3;

public class typesOFF {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.weight = (float) 12.3;
        t2.weight = (float) 26.5;
        System.out.println("Test 1");
        System.out.println("Tank 1 weight " + t1.weight);
        System.out.println("Tank 2 weight " + t2.weight);
        t1 = t2;
        System.out.println("Test 2");
        System.out.println("Tank 1 weight " + t1.weight);
        System.out.println("Tank 2 weight " + t2.weight);
        t1.weight = (float) 13.7;
        System.out.println("Test 3");
        System.out.println("Tank 1 weight " + t1.weight);
        System.out.println("Tank 2 weight " + t2.weight);


    }
}
