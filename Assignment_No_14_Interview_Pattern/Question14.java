/*14. Print a pattern with diagonal stars and numbers.

1
*2
3*
*4
5*

*/


class Question14
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
				if (i == 1)
				{
					System.out.print(x++);
					break;
				}
				else if (j%2 != 0)
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