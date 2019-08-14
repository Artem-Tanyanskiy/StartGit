package EdThread;

public class NewThread {
    public static void main(String args[]) {
        new DemoThread();
        try{
            for(int i = 5; i>0; i--){
                System.out.println("Boos stream"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Boss stream interrupted");
        }
        System.out.println("Boss stream finished");
    }
}
