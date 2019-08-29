package StudeProces;

import java.io.*;
public class InOutputText {
    public static void main(String args[]){
        int i;


       try{
           new FileReader("a.txt");
           FileReader ArtStream;
       ArtStream = new FileReader(args[0]);
       do{
           i = ArtStream.read();
           if (i != -1) System.out.println((char) i);
       }while(i != -1);

       }catch (FileNotFoundException e) {
           System.out.println(" Файл не найден");
       }catch(IOException e){
           System.out.println("Ошибка ввода-вывода");
       }




        }
    }

