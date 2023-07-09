// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int plant = sc.nextInt();
        if(plant > 0 && plant <=rows){
            count++;
        }
        if(plant > rows*columns-1 && plant <=rows*columns){
            count++;
        }
        for(int i=1;i<columns-1;i++)
        {
            if((i*rows)+1 == plant)
            {
                count++;
            }
        }
        if(count>=1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}