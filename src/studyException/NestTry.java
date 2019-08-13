package studyException;

public class NestTry {
    public static void main(String[] args) {
       // args[1]= String.valueOf(new int[]{1});
        int a = args.length;
        System.out.println(a);
        int b =1;
        int c = b/a;
        System.out.println(c);
    }
}