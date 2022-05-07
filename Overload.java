class Areadiff
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2));
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y);
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z);
    }
    void area(double a, double b)
    {
    double d = 0.5*a*b;
    System.out.println("The area of Triangle is "+d);
    }
}
class Overload 
{
     public static void main(String args[]) 
	{
	   Areadiff ob = new Areadiff();
	   ob.area(5);
	   ob.area(11,12);
	   ob.area(2.5);
       ob.area(5.6,10);
        }
}