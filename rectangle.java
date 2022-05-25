package graphics;
import java.util.Scanner;

public class rectangle implements result{

     Scanner sc =new Scanner(System.in);
     int l,b;
     double ar;
	
	public void area()
	{
		System.out.println("Enter Length");
		l=sc.nextInt();
		System.out.println("Enter Breadth");
		b=sc.nextInt();
		ar=l*b;
		System.out.println("Area of Rectangle is: "+ar);
	}

}