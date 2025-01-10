 import java.util.Scanner;
 public class polygonarea {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("input the sides of polygon: ");
        int ns=input.nextInt();
        System.out.print("input the sides of polygon: ");
        double s= input.nextDouble();
        System.out.println("area of pentagon is"+polygon(ns, s)+"\n");
    }
    public static double polygon(int ns, double s){
        return (ns*(s*s))/(4*Math.tan(Math.PI/ns));
    }
    
}
