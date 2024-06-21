package LOOP;
import java.util.*;
public class calAVG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("take not of input");
        int a =sc.nextInt();
        if (a<=0) {
            System.out.println("it should be greater than 0");
            
        }
        else{
            double sum=0;
            for(int i=1;i<=a;i++){
                System.out.println("enter the numbers");
                double number=sc.nextDouble();
                sum=sum+number;
            }
            double avg=sum/a;
            System.out.println(avg);
        }

    }
    
}
