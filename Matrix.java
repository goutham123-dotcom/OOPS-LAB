import java.util.Scanner;
public class Matrix
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int i,j,row,col;
        System.out.println("Enter the number of rows");
        row = S.nextInt();
        System.out.println("Enter the numbe of columns");
        col = S.nextInt();
        int[][] mat = new int[row][col];
        
        System.out.println("Enter the elements of the matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat[i][j] = S.nextInt();
                
            }
        }
        System.out.println("The Elements of the Matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}