package studyException;

public class TryExc {
    public static void main(String[] args) {
        int a = 2, b = 0;
        try{
            int c = a/b;
            System.out.println("err");
        } catch (Exception e) {
            System.out.println("block catch");
            //e.printStackTrace();
        }
        System.out.println("finish");

    }
}
