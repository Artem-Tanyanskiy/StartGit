package EdThread;

import org.w3c.dom.ls.LSOutput;

public class DemoThread implements Runnable{

       Thread t ;
        DemoThread(){
            t = new Thread(this,"Демонстрационный поток");
            System.out.println("Дочерный поток "+t);
            t.start();
        }
        public void run(){
        try{
            for(int n=5; n<0; n--){
                System.out.println("Дочерный поток"+n);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("stream interrupted");

        }
            System.out.println("Дочерный поток завершен");
    }}


