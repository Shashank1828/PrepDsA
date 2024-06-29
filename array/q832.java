package array;

import LOOP.reverse;

public class q832 {
    public static void main(String[] args) {
        
    }

    static  int[][]fliparray(int[][]image){

        int[][]flip=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){

           int[]r=reverse(image[i]);
        }
        return flip;
    }
    static int[]reverse(int[]i){
        int rev[]=new int[i.length];
    int start=0;
    int end=i.length-1;
    while (start<end) {
        swap(i,start,end);
        start++;
        end--


        
    }
    return rev;
}

    static void swap(int[]i,int start,int end){
        int temp=i[start];
         i[start]=i[end];
         i[end]= temp;
       
     
        

        
    }
    
}
