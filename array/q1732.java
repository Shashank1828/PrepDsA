package array;

public class q1732 {
    public static void main(String[] args) {
        
    
    int[]gain={-5,1,5,0,-7};
    int[]target=Altitude(gain);
    int max=maxAlt(target);
    System.out.println(max);

    }
    public static int[] Altitude(int[]gain){
        int[] altitude=new int[gain.length+1];
        altitude[0]=0;
        for(int i=0;i<gain.length;i++){
            altitude[i+1]=altitude[i]+gain[i];
        }
        return altitude;
        
    }
    static int maxAlt(int [] target){

        int max=0;
      for(int i=0;i<target.length;i++){
        if (target[i]>max) {
            max=target[i];
            
        }
      }
        return max;
        
    }
    
}
