package array;

public class q1773 {
    public static void main(String[] args) {

        String[][]items= { 
            {"phone","blue","pixel"},
            {"computer","silver","lenovo"},
            {"phone","gold","iphone"}
        };
        String rulekey="color";
        String rulevalue="silver";
        int ans=countmatch(items, rulekey, rulevalue);
        System.out.println(ans);
        
        
    }
    public static int  countmatch(String[][]items,String rulekey,String rulevalue){
        int count=0;
        int index=-1;

        if (rulekey.equals("Type")) {
            index=0;
            
        }
        else if (rulekey.equals("color")) {
             index=1;
            
            
        }
        else if (rulekey.equals("name")) {
            index=2;
            
        }
        for(int i=0;i<items.length;i++){
            if (items[i][index].equals(rulevalue)) {
                count++;
                
            }
        }

                
            
            
    
                
            
        
        return count;
        
    }
}

