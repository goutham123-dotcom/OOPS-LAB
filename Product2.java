import java.util.Scanner;
class product
{
int pcode,price;
String pname;
Scanner sc=new Scanner(System.in);
void read()
{
System.out.println("Enter the pcode:");
pcode=sc.nextInt();
System.out.println("Enter the pname:");
pname=sc.next();
System.out.println("Enter the price:");
price=sc.nextInt();
}

void display()
{
    System.out.println("Product with lowest price");
System.out.println("Pcode:"+pcode);
System.out.println("Pname:"+pname);
System.out.println("Price:"+price);
}

}




public class Product2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int temp;
product p1=new product();
    System.out.println("Enter the details of Product 1");
p1.read();

product p2=new product();
    System.out.println("Enter the details of Product 2");
p2.read();


product p3=new product();
    System.out.println("Enter the details of Product 3");
p3.read();

temp=p1.price;
if(p2.price<temp && p2.price<p3.price)
{
temp=p2.price;
p2.display();
}
else if(p3.price<temp)
{
temp=p3.price;
p3.display();
}
else
{
p1.display();
}
}
}
