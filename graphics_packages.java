import graphics.circle;
import graphics.triangle;
import graphics.square;
import graphics.rectangle;

import java.util.Scanner;

public class graphics_packages
{
public static void main (String args[])
{
    int op;
    Scanner sc =new Scanner(System.in);
    while(true)
    {
    System.out.println("\n MENU \n 1.CIRCLE \n 2.RECTANGLE \n 3.TRIANGLE \n 4. SQUARE\n 5. EXIT");
		System.out.println("\n Choose an option: ");
        op=sc.nextInt();
        
        switch(op)
        {
        
            case 1:
            circle ob =new circle();
            ob.area();
           
            break;
            case 2:
            rectangle ob1= new rectangle();
            ob1.area();
           break;
           case 3:
           triangle ob2= new triangle();
           ob2.area();
           break;
           case 4:
           square ob3= new square();
           ob3.area();
                break;
            case 5:
                System.exit(5);
                break;
            default:
            System.out.println("invalid option");
        }

        
        }

}
}
