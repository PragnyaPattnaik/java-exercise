import java.util.Scanner;
public class sumofdigits{
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int n1;
    int n2;
    int sum;
    System.out.println("1st digit");
    n1=input.nextInt();
    System.out.println("2nd digit");
    n2=input.nextInt();
    sum=n1+n2;
    System.out.printf("%d\n",sum);
  }
}