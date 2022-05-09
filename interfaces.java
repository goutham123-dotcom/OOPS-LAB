import java.util.Scanner;



interface Shape
    
{
    Scanner sn=new Scanner(System.in);            
   
    void input();
    void area();
    void perimeter();
}
class Circle implements Shape
{
Scanner sn = new Scanner(System.in);
    int r = 0;
    double pi = 3.14, ar = 0;
    @Override
    public void input()
    {
      System.out.print("Enter radius of circle:");
			r=sn.nextInt();
    }
    @Override
    public void area()
    {
        ar = pi * r * r;
        System.out.println("Area of Circle:\t"+ar);
    }
    @Override
    public void perimeter()
    {
     ar = 2 * pi * r;
     System.out.println("Perimeter Of Circle:\t"+ar);
    }
}
class Rectangle implements Shape
{

    int l = 0, b = 0;
    double ar;
    Scanner sn = new Scanner(System.in);
    @Override
    public void input()
    {
   
         System.out.print("Enter length of Rectangle:");
			l=sn.nextInt();
        System.out.print("Enter breadth of Rectangle:");
			b=sn.nextInt();
    }
    @Override
    public void area()
    {
        
        ar = l * b;
        System.out.println("Area of Rectangle:\t"+ar);
    }
    @Override
    public void perimeter()
    {
       
        ar = 2 * (l + b);
        System.out.println("Perimeter of Recangle:\t"+ar);
    }
}
public class interfaces
{
    Scanner sn =new Scanner(System.in);
    public static void main(String[] args)
    {
        
        int ch;
        Scanner sc = new Scanner(System.in);
        Circle ob = new Circle();
        Rectangle obj = new Rectangle();
        do
        {
            System.out.println("\n1.Circle\n2.Rectangle\n3.exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1 :ob.input();
                        ob.area();
                        ob.perimeter();
                        break;
                case 2 :obj.input();
                        obj.area();
                        obj.perimeter();
                        break;
                case 3 :System.out.println("Exited...");
                        System.exit(0);
            }
        }while(true);
    }
    }
