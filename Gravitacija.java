import java.lang.Math;
import java.util.Scanner;


public class Gravitacija {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);


       double KONSTANTAC = 6.674e-11;
       double KONSTANTAM = 5.972e24;
       double KONSTANTAR = 6.371e6;

       System.out.println("Da li zelite nadmorsko visiono vnesti v metrih(Vpisite 1) ali kilometrih(0)");
       int odlucitev = sc.nextInt();
       int c;
       if (odlucitev==1) {

           System.out.println("Vnesite nadmorsko visino v metrih: ");
           double v = sc.nextDouble();
           double power = KONSTANTAR + v;
           double a = (KONSTANTAC*KONSTANTAM)/(Math.pow(power, 2));
           System.out.println("Gravitacijski pospesek je: " + a + " m/s^2");

       }else{
           System.out.println("Vnesite nadmorsko visino v kilometrih: ");
           double v = sc.nextDouble();
           double power = KONSTANTAR +v*1000;
           double a = (KONSTANTAC*KONSTANTAM)/(Math.pow(power, 2));
           System.out.println("Gravitacijski pospesek je: " + a + " m/s^2");
	   
       }
   }
}