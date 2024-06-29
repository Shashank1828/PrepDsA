package array;

import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
        int [] [] arr=new int[3] [];
      //  arr[0]=new int [2];
      //  arr[1]=new int [3];
      //  arr[2]=new int[4];



        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++) {
                arr[row][col]=sc.nextInt();
            }
            System.out.println();
        }

        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }


   
            
        }

    }

