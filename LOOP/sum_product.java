package LOOP;

public class sum_product {
    public static void main(String[] args) {
        int k=112;
        int sum=0;
        int pro=1;
        while (k>0) {
            int temp=k&10;
            

           sum+=temp;
           pro*=temp;
           k=k/10;}
           int result=pro-sum;
           System.out.println(results);
            
          
        }
      
    }
    

