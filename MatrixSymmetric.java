import java.io.*;
import java.util.*;
class MatrixSymmetric
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,k=0;
		int ar[][]=new int[3][3];
		System.out.println("Enter Numbers:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				ar[i][j]=in.nextInt();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(ar[i][j]!=ar[j][i])
				{
					k=1;
				}
			}
		}
		if(k==1)
		{
			System.out.println("Matrix is not symmetric");
		}
		else
		{
			System.out.println("Matrix is symmetric");
		}
		System.out.println("The transpose matrix:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(ar[j][i]+" ");
			}
			System.out.println();
		}
	}
}