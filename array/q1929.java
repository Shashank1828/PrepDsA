package array;

import java.util.Arrays;

public class q1929 {
public static void main(String[] args) {
    int [] nums={1,2,1};
    int[]res=targetarray(nums);
    System.out.println(Arrays.toString(res));
}
  public static int[]targetarray(int nums[]){

    int[]ans=new int[2*nums.length];
    for(int i=0;i<nums.length;i++){
        ans[i]=nums[i];
        ans[i+nums.length]=nums[i];
    }
      
    return ans;

  }
  
}
