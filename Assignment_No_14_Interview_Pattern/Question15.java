/*
15. Print a pattern with alternating diagonal stars and numbers.

1*
*2
3*
*4
5*

*/


class Question15
{
	public static void main(String[] arge)
	{
	int x = 1;

	for (int i=1;i<=5;i++)
	{
		for (int j=1;j<=2;j++)
		{
			if (i%2 != 0)
			{	
				if (j%2 != 0)
				{
					System.out.print(x++);
				}
				else 
				{
					System.out.print("*");
				}

			}
			else 
			{
				if (j%2 == 0)
				{
					System.out.print(x++);
				}
				else 
				{
					System.out.print("*");
				}

			}		
		}
		System.out.println();
	}
	}
}