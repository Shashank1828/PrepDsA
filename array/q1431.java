package array;

import java.util.Arrays;

public class q1431 {
    public static void main(String[] args) {
      int[]candie={2,3,5,1,3}  ;
      int extracandies=3;
      int maxcandy=max(candie);
      boolean[]ans=kidswithcandies(candie, extracandies,maxcandy);
      System.out.println(Arrays.toString(ans));
     


    
}
public static boolean[]kidswithcandies(int[]candie,int extracandies,int max){

    boolean[]booarr=new boolean[candie.length];
    for(int i=0;i<candie.length;i++){
        if (candie[i]+extracandies>=max) {
            booarr[i]=true;
            
        }
        else{
            booarr[i]=false;
        }


        
    }
    return booarr;
    
}
public static int max(int[]candie){
    int max=candie[0];
    for(int i=0;i<candie.length;i++){
        if (candie[i]>max) {
            max=candie[i];

            
        }
    }
    return max;
}

    
}
