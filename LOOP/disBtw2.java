package LOOP;
import java.util.*;
public class disBtw2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("x1 cordinate");
        double x1=sc.nextDouble();
        System.out.println("x2 cordinate");
        double x2=sc.nextDouble();
        System.out.println("y1 cordinate");
        double y1=sc.nextDouble();
        System.out.println("y2 cordinate");
        double y2=sc.nextDouble();


        System.out.println();
        double distance=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));

        System.out.println(distance);

        

    }
    
}
