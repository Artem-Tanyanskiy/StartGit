package day3;
import java.util.*;
public class CoinToss {
    public static void main(String[] args) {
        int coin;
   Random rand = new Random();
    for(int i=1; i<11; i++){
        coin = rand.nextInt(2);
        if (coin == 0){
        System.out.println(i + " - орел");}
        else
            System.out.println(i + " - решка");

    }

    }
}
