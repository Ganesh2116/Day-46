/*
21. Print a pattern with stars on one half and numbers on the other.

*****12345
****1234
***123
**12
*1

*/
class Question21
{
	public static void main(String[] arge)
	{
		for (int i=1;i<=5;i++)
		{
			int x = 1;
			
			for (int j=i;j<=5;j++)
			{
				System.out.print("*");
			}

			for (int j=i;j<=5;j++)
			{
				System.out.print(x++);
			}

			System.out.println();
		}
	}
}