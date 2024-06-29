package array;

import java.util.Arrays;

public class q1480 {
    
    public static void main(String[] args) {
        int[]nums={1,2,3,4};
        int []ans=runningsum(nums);
System.out.println(Arrays.toString(ans));
    }

     static int[] runningsum(int[] nums){
        int[] target=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
           
            target[i]=sum+nums[i];
            sum=sum+nums[i];


        }
        return target;
        
    }
}
