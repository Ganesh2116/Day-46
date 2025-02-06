/*
19. Print a mirrored inverted right-angled triangle with numbers and stars.

7*8*9*10
  4*5*6
   2*3
    1

*/


class Question19
{
	public static void main(String[] arge)
	{
	int x =7;	
	for (int i=4;i>=1;i--)
	{
		for (int j=i;j< 4;j++)
		{
			System.out.print(" ");
		}
		for (int j=1;j<=i;j++)
		{
			if (i == j )
			{
				System.out.print(x);
			}
			else
			{
				System.out.print(x+"*");	
				
			}
			x++;
		}
		 x = x - (i - 1) - i; // x = 7 - (4 -1) - 4 = 0.
		System.out.println();
	}
	}
}