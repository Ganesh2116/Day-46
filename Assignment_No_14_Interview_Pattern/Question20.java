/*
20. Print a pattern with numbers on one half and stars on the other.

12345*****
1234****
123***
12**
1*

*/


class Question20
{
	public static void main(String[] arge)
	{
		for (int i=1;i<=5;i++)
		{
			int x = 1;
			for (int j=i;j<=5;j++)
			{
				System.out.print(x++);
			}
			for (int j=i;j<=5;j++)
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}
}