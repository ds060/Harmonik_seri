package Harmonik;
import java.util.Scanner;
public class harmonikSeri {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int num=inp.nextInt();

        double result=0;
        for (double i=1; i<=num; i++){
        result+=(1/i);}

        System.out.println("sayının Harmonik değeri:" + result);
    }
}
