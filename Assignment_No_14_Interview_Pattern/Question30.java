/*
30. Print a pattern with numbers in the shape of a star.

  1
 2*3
4*5*6
 2*3
  1
*/


class Question30
{
	public static void main(String[] arge)
	{
	int x =1;	
	for (int i=1;i<=3;i++)
	{
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

	int y =2;	
	for (int i=2;i>=1;i--)
	{
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
		y = y - (i-1)-i;
		System.out.println();

	}

	}

}