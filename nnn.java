import java.util.Scanner;
public class nnn{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int n=input.nextInt();
        int results=n+(n*10+n)+(n*100+n*10+n);
        System.out.println("results are: "+results);
    }
}
    
