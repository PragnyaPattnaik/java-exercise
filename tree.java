import java.io.*;
public class tree {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h =1;
        System.out.println("the number of test cases");
        int t=Integer.parseInt(br.readLine());
        for(int j=0;j<=t;j++){
            System.out.print("the number of cycles: ");
            int n=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<=n;i++){
            if(i%2!=0)
            {
                h*=2;
            }
            else{
                h+=1;
            }

        }

    }
    
}
