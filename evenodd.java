import java.util.*;
public class evenodd{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("enter a number");
        int n = input.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}