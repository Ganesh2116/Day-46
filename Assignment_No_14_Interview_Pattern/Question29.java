/*
29. Print a pattern with stars in the shape of a number.

  *
 **
***
 **
  *
*/


class Question29
{
	public static void main(String[] arge)
	{	
		for (int i=1;i<=3;i++)
		{
			for (int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();


		}
	
		for (int i=2;i>=1;i--)
		{
			for (int j=1;j<3;j++)
			{
				System.out.print(" ");
			}
			
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();


		}


	}

}
