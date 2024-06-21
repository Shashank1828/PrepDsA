package LOOP;
import java.util.*;

public class palindromeORnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int originalNum = num;
        int reverse =0;
        while (num!=0) {
            int rem=num%10;
            reverse=reverse*10+rem;
           num/=10;


            
        }
        if (originalNum==reverse) {
            System.out.println("its a palindrome");
            
        } else{
            System.out.println("not pelindrome");
        }
    }
}
