import Arithmetic.AdditionOperation;
import Arithmetic.DivisionOperator;
import Arithmetic.MultiplicationOperator;
import Arithmetic.SubtractionOperation;
import java.util.Scanner;
public class Main {
 public static void main(String[] args)
 {
 Scanner scanner = new Scanner(System.in);
     while(true)
     {


 System.out.println("Choose an operation : \n1.Add \n2.Subtract\n3.Multiply \n4.Division \n5.Exit");
 int op = scanner.nextInt();
 System.out.println("Enter the numbers : ");
 int number1 = scanner.nextInt();
 int number2= scanner.nextInt();
 System.out.println("The Result is : ");
     
 switch (op)
 {

 case 1:
 AdditionOperation additionOperation = new
AdditionOperation();

System.out.println(additionOperation.operateNumbers(number1,number2)
);
 break;
 case 2:
 SubtractionOperation subtractionOperation = new
SubtractionOperation();

System.out.println(subtractionOperation.operateNumbers(number1,number2));
 break;
 case 3:
 MultiplicationOperator multiplicationOperator = new
MultiplicationOperator();

System.out.println(multiplicationOperator.operateNumbers(number1,number2));
 break;
 case 4:
 DivisionOperator divisionOperator = new DivisionOperator();

System.out.println(divisionOperator.operateNumbers(number1,number2));
break;
case 5:
    System.exit(5);
    break;

 
 default:
 System.out.println("Invalid Code");
}
 }
 }
}