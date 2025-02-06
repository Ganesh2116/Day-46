/*
28. Print a triangular pattern with alternating rows of numbers and stars.

1
**
123
****
12345
*/


class Question28 
{
	public static void main(String[] arge)	
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j>=i;j++)
			{
				if (i%2 != 0)
				{
					System.out.print(x++);
				}
				else 
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}