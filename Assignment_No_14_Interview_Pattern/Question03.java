/*
3. Print a pattern with increasing numbers and stars.

1
2*
3*4
5*6*7
8*9*10*11

*/

class Question03
{
	public static void main(String[] arge)
	{
	int n = 1;
	for (int i=1;i<=7;i++)
	{
		
		for (int j=1;j<=i;j++)
		{	
			if (i != 2 && i % 2 == 0)
			{	
				continue;
			}
			else if (j%2 != 0)
			{
				System.out.print(n);
				n++;
			}
			else 
			{
				System.out.print("*");
			}
		}
		if (i != 2 && i % 2 == 0)
		{	
			continue;
		}
		else 
		{
			System.out.println();
		}
	}

	}
}
