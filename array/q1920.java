package array;

import java.util.Arrays;

public class q1920 {
    public static void main(String[] args) {
        int[]nums={0,2,1,5,3,4};
        int[]ans=target(nums);
        System.out.println(Arrays.toString(ans));


    }
    static int[] target(int []nums){
       int targetarray[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        targetarray[i]=nums[nums[i]];

       }
    
               return targetarray;
        
    }
    
        
    }

