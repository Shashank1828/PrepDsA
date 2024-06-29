package array;

public class pangram {
    public static void main(String[] args) {
        String sentence="xyjfkyugkuyfjuyfdcgd";
        boolean ans=ispangram(sentence);
        System.out.println(ans);
        
    }

    public static boolean ispangram(String sentence){
       if (sentence.length()<26) {
        return false;
        
       }
       boolean[]letter=new boolean[26];
       char[]arr=sentence.toCharArray();

       for(char c:arr){
        if(Character.isLetter(c)){
            letter[Character.toLowerCase(c)-'a']=true;
        }
       }

       for(boolean b:letter){
        if (b==false) {
            return false;
            
        }
       }
        return true;


        
    }
    
}
