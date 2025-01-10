import java.util.Scanner;
public static void main(String[]args){
    Scanner input= new Scanner(System.in);
    System.out.println("Input the length of the hexagon: ");
    double s= input.nextDouble();
    System.out.println("the area of hexagon is: "+hexagonArea(s) + "\n");

}
public static double hexagonArea(double s){
    return (6*(s*s))/(4*Math.tan(Math.PI/6));
    
}