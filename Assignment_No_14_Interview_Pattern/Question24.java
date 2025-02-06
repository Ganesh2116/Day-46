/*
24. Print a spiral pattern with numbers and stars.

1 2 3 4 5
* * * * 6
* * * * 7
* * * * 8
* * * * 9
*/


class Question24
{
	public static void main(String[] arge)
	{
		int x =1;
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if (i == 1 || j == 5)	
				{
					System.out.print(x+" ");
					x++;
				}
				else 
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
}