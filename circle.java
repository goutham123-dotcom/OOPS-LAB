
package graphics;
import java.util.Scanner;
interface result
{
    public void area();
}
public class circle implements result{
    Scanner sc =new Scanner(System.in);
    double ar,r;
    public void area()
    {
    System.out.println("enter the radius of circle");
    r=sc.nextDouble();
    ar=3.14*r*r;
    System.out.println("area of circle:"+ar);
    }
}