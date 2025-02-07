/*
25. Print a cross pattern with numbers and stars.

  1
 2*3
3*4*5
 2*3
  1
*/


class Question25
{
	public static void main(String[] arge)
	{
		
	for (int i=1;i<=3;i++)
	{
		int x = i;
		for (int j=3;j>=i;j--)
		{
			System.out.print(" ");
		}
		for (int j=1;j<=i;j++)
		{
			
			if (i != j && i != 1)
			{
				System.out.print(x+"*");
				x++;
				
			}
			else
			{
				System.out.print(x++);
			}
				
		}
		System.out.println();
	}

		
	for (int i=2;i>=1;i--)
	{
		int y = i;
		for (int j=i;j< 3;j++)
		{
			System.out.print(" ");
		}

		for (int j=1;j<=i;j++)
		{

			if (i != j && i != 1)
			{
				System.out.print(y+"*");
				y++;
			}
			else
			{
				System.out.print(y++);
			}
				
		}
		System.out.println();

	}

	}

}