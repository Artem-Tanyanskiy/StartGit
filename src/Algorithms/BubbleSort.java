package Algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int mas[] ={5,6,8,2,4,8,2,5};
        System.out.println("default mas");
        for(int i:mas){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        int a;
        for(int i=0; i<mas.length-1; i++){
            for(int j=0;j<mas.length-1-i;j++){
                if(mas[j]>mas[j+1]){
                   a=mas[j];
                   mas[j]=mas[j+1];
                   mas[j+1]=a;
                }
            }
        }
        System.out.println("sort mas");
        for(int i: mas){
            System.out.print(i+" ");
            i++;
        }
    }


}
