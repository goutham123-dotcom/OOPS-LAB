import java.util.Scanner;
class area
{
	double area,peri;
	void area(int r)
	{
    area=3.14*r*r;
	}
	void perimeter(int r)
	{
    peri=2*3.14*r;
	}

void display()
{
System.out.println("Area\t=\t"+area);
System.out.println("perimeter\t=\t"+peri);
}

}


public class Circle {
public static void main(String args[])
{
int r;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the radius:");
r=sc.nextInt();
area a=new area();
a.area(r);
a.perimeter(r);
a.display();
}
}