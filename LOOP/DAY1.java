package LOOP;
import java.util.*;
public class DAY1 {
   
    public static void main(String[] args) {
    /* System.out.println("if-else");
       int salary=25000;
       if (salary>10000) {
       System.out.println("you can visit taj");
            
        } 
        else{
          
        System.out.println(salary + "now you can visit taj");
    }
      */

        /*  System.out.println("MULTIPLE IF-ELSE");
       System.out.println();
       int salary=17000;
       if (salary>25000) {
        salary+= 3000;
        
       }
       else if(salary>10000) {
        salary+=2000;
       }
       else{
        salary+=1000;
       }
       System.out.println(salary); */








     System.out.println("LOOPS");
     System.out.println();
     Scanner sc =new Scanner(System.in);

     // Print numbers using for loop--------- initialise-check-run
      
     for(int num=0;num<=10;num+=5){   //num++ or num+=1,2,3 etc...
        System.out.println(num);
     }
      System.out.println();
      

      //WHILE LOOP

      System.out.println("write no of time u want to print");
        int n =sc.nextInt();

        int num=1;
        
      while (num<=n) {
        System.out.println("hello");
        num++;
        
      }

      // USE WHILE LOOP WHEN DONT KNOW HOW MANY TIME WE HAVE TO RUN LOOP
      // USE FOR LOOP WHEN WE KNOW HOW MANY TIME WE HAVE TO RUN


       // DO-WHILE LOOP
       System.out.println();
       int k=1;
       do{
        System.out.println("hiiiii");
        k++;

       } while(k!=5);

    
    }
    
}
