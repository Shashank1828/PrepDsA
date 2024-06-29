package array;

import java.util.Arrays;

public class q1389 {
    public static void main(String[] args) {
        int[]nums ={0,1,2,3,4};
        int[]index={0,1,2,2,1};
        int [] res= targetarray(nums,index);
        System.out.println(Arrays.toString(res));
    }
    public static int[] targetarray(int[]nums,int[] index){
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if (index[i]<i) {
                for(int j=0;j>index[i];j--){
target[j]=target[j-1];

                }
                
            }
            target[index[i]]=nums[i];
        }
        return tar;
        
    }
    
}
