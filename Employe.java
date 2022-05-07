import java.util.Scanner;
class Employe{
	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	int n;
	System.out.print("Enter Number of Employees:");
	n=sn.nextInt();
	Teacher tr[]=new Teacher[n];
	for (int i=0;i<n;i++) {
		tr[i]=new Teacher();
	}
	for (int i=0;i<n;i++) {
		System.out.println("Teacher\t"+(i+1)+":");
		tr[i].display();
	}
	
}
}

class Emp{
	Scanner sn=new Scanner(System.in);
	int empid;
	String name;
	float salary;
	String address;

	Emp(){
		System.out.println("Enter Details of Teacher:");
		System.out.print("Input Empid:");
		empid=sn.nextInt();
		System.out.print("Input Name:");
		name=sn.next();
		System.out.print("Input Salary:");
		salary=sn.nextFloat();
		System.out.print("Input Address:");
		address=sn.next();
	}
}
class Teacher extends Emp{
	String dept;
	String sub;
	Teacher(){
		super();
		System.out.print("Input Department:");
		dept=sn.next();
		System.out.print("Input Subject:");
		sub=sn.next();
	}

	void display(){
		System.out.println("Empid:"+empid);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("Address:"+address);
		System.out.println("Department:"+dept);
		System.out.println("Subject:"+sub);
	}
}