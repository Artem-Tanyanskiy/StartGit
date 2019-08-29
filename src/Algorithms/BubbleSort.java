package Algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int mas[] ={5,6,8,2,4,8,2,5,1,9};
        System.out.println("Default mas");
        System.out.println(Arrays.toString(mas));
        bubbleSort(mas);
        System.out.println("Sort mas");
        System.out.println(Arrays.toString(mas));
    }
   public static void bubbleSort(int mas[]){
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

    }


    }
