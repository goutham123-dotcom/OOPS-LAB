import java.util.Scanner;
public class Main {
 public static void main(String[] args)
 {
 Scanner scanner = new Scanner(System.in);
 int primeCount,multipleCount;
 System.out.println("Enter number of Prime Numbers : ");

 primeCount = scanner.nextInt();
 System.out.println("Enter number of Multiples of 5 : ");
 multipleCount = scanner.nextInt();
 PrimeNumbers thread1 = new PrimeNumbers(primeCount);
 thread1.start();
 MultiTable5 thread2 = new MultiTable5(multipleCount);
 thread2.start();
 }
}
