package graphics;
import java.util.Scanner;

public class square implements result{

     Scanner sc =new Scanner(System.in);
     int s;
     public void area()
     {
     System.out.println("Enter Length");
		s=sc.nextInt();
    System.out.println("the area of the square is "+Math.pow(s, 2)+" sq units");
}
}