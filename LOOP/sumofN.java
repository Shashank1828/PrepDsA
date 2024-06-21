package LOOP;
import java.util.*;
public class sumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of inputs");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("input data");
            int digit=sc.nextInt();
            sum+=digit;
        }
        System.out.println(sum);
    }
    
}
