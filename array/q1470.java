package array;

import java.util.Arrays;

public class q1470 {
    
    public static void main(String[] args) {
        int[]nums={2,5,1,3,4,7};
        int[] ans=targetarray(nums);

        System.out.println(Arrays.toString(ans));
        
    }
   public  static int[] targetarray (int nums []){
    
    int[]target=new int[nums.length];
    int n=nums.length/2;
    for(int i=0;i<n;i++){
        target[2*i]=nums[i];
        target[2*i+1]=nums[n+i];
    }
   
    return target;

   }
}
