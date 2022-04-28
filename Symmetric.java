import java.util.Scanner;
public class Symmetric
{
public static void main(String args[])
{
int i,j,row,col,c=0;
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int b[][]=new int[10][10];

    System.out.println("Enter the number of rows");
        row = sc.nextInt();
        System.out.println("Enter the numbe of columns");
        col = sc.nextInt();


System.out.println("Enter the elements of matrix");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
a[i][j]=sc.nextInt();
}
}

for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
	b[j][i]=a[i][j];	
	}
}

System.out.println("Matrix is");
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
        
	System.out.print(a[i][j]+" ");	
	}
	System.out.println();
}
System.out.println("Transpose is ");
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
        
	System.out.print(b[i][j]+" ");	
	}
	System.out.println();
}


for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
if(a[i][j]!=b[i][j])
{
c=1;
break;
}
}
}

if(c==1)
System.out.println("Matrix is Not Symmetric");

if(c==0)
System.out.println("Matrix is Symmetric");

}
}