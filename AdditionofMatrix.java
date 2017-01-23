import java.util.Scanner;
public class Additionofmatrix {

	public static void main(String[] args) {
		int i,j;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int r = s.nextInt();
		System.out.println("Enter no. of columns");
		int c = s.nextInt();
		int[][] a = new int[r][c];
		int[][] b = new int[r][c];
		System.out.println("Enter the first matrix");
		for( i=0; i<r; i++)
			{
				for( j=0; j<c; j++)
					{
						a[i][j] = s.nextInt();
					}
			}
		System.out.println("Enter the second matrix");
		for( i=0; i<r; i++)
			{
				for(j=0; j<c; j++)
					{
						b[i][j] = s.nextInt();
					}
			}
		int[][] d = new int[r][c];
		for( i=0; i<r; i++)
			{
				for(j=0; j<c; j++)
					{
					d[i][j] = a[i][j] + b[i][j];
					
					}
			}
		System.out.println("The sum of matrix is");
		for( i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
			 System.out.print(d[i][j]+" ");
			}
			 System.out.println();
			
		}
		
	
	
	}

}
