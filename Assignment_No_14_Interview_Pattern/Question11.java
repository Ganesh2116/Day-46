/* 11. Print a hollow square with numbers and stars on the border.

1*2*3*4*5
1       5
1       5
1       5
1*2*3*4*5

*/

class Question11
{
	public static void main(String[] arge)
	{
	for (int i=1;i<=5;i++)
	{
		int x = 1;
		for (int j=1;j<=5;j++)
		{
			
			if (i==1 ||i==5 ||j==1||j==5)
			{	
				if (i==1 || i == 5)
				{		
					if (j<5)
					{												System.out.print(x+"*");
					}
					else
					{
						System.out.print(x);
					}	
					x++;
				}
				else  if (j==1 || j==5)
				{
					if (j == 1)
						System.out.print("1");	
					else 
						System.out.print("5");
				}
			}
			else
			{
				System.out.print("  ");
			}

		}
		System.out.println();
	}

	}
}