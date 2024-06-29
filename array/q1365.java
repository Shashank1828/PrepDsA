package array;

import java.util.Arrays;

public class q1365 {
    public static void main(String[] args) {
        int[]nums={8,1,2,2,3};

 int []ans=smaller(nums);
System.out.println(Arrays.toString(ans));
        
    }
    static int[]smaller(int[]nums){
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if (j!=i && nums[j]<nums[i]) {
                    count++;
                    
                }
            }
            result[i]=count;
        }
        return result;
      
        }
    
    }
    

