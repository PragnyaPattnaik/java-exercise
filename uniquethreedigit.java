public class uniquethreedigit {
    public static void main(String[]args){
        int amount= 0;
        for (int i=1; i<=4; i++) {
            for(int k=1;k<=4;k++){
                for(int j=1;j<=4; j++){
                    if(k !=1 && k!=j && i!=j){
                        amount++;
                        System.out.println(i+ ""+j+""+k);
                    }
                }
            }
            
        }
        System.out.println("Total number of the three-digit-number is"+amount);
    }
    
}
