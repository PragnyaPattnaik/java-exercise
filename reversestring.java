import java.util.Scanner;
public class reversestring{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("input a string: ");
        char[] letters = scanner.nextLine(). toCharArray();
        System.out.print("Reverse string: ");
        for(int i = letters.length-1;i>=0;i--){
        System.out.print(letters[i]);
        }
    System.out.println("\n");
    }
}

