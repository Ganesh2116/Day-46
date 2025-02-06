/*
22. Print a pattern with alternating columns of stars and numbers.

1*2*3*4*5
6*7*8*9*0
*/

class Question22
{
	public static void main(String[] arge)
	{
		int x =1;
		for (int i=1;i<=2;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if (x == 10 )
				{
					x= 0;
				}
				if ( x == 5 || x == 0)
				{
					System.out.print(x);
				}
				else 
				{
					System.out.print(x+"*");
				}
				x++;
			}
			System.out.println();
		}
	}
}