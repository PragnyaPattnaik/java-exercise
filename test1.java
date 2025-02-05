import java.io.*;
public class test1 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the no of chocolates");
        int c= Integer.parseInt(br.readLine());
        System.out.println("enter the no of wrappers");
        int w= Integer.parseInt(br.readLine());
        int days=0;
        while (c>0){
            days +=c;
            w+=c;
            c=0;
            if(w>=7){
                c=w%7;
                w/=7;
            }
        }
      System.out.print("Number of days:"+days);
            
    }
    
}








