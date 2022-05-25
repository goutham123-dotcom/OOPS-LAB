package graphics;
import java.util.Scanner;

public class triangle implements result{

     Scanner sc =new Scanner(System.in);
     double h,b,ar;
     public void area()
     {

     System.out.println("enter the height of triangle");
    h=sc.nextDouble();
     System.out.println("enter the breadth of triangle");
    b=sc.nextDouble();
    ar=h*b/2;
    System.out.println("area of triangle:"+ar);
     }
}
