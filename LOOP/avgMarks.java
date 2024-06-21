package LOOP;
import java.util.*;
public class avgMarks {
    public static void main(String[] args) {
        int n=5;
        Scanner sc=new Scanner(System.in);
        double sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("ans marks of students");
            double marks=sc.nextDouble();
            sum=sum+marks;

        }
        double avg=sum/n;
        System.out.println(avg);
    }
    
}
