public class countcharacters{
    public static void main(String[] args) {
        String test="aa bb,cc d efg. DE: kk?? 5.6";
        count(test);
        }
        public static void count(String x){
            char[] ch = x.toCharArray();
            int letter = 0;
            int Space = 0;
            int num = 0;
            int other = 0;
            for (int i= 0; i<x.length(); i++){
                letter++;
            if(Character.isWhitespace(ch[i])){
                Space++;
            }
            else if(Character.isDigit(ch[i])){
                num++;
            }
            else{
                other++;
            }
        }
        System.out.println("letter: "+letter);
        System.out.println("Space: "+Space);
        System.out.println("number: "+num);
        System.out.println("other: "+other);
    }
}