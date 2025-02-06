/*
27. Print a wave pattern with numbers and stars.

1*2*3*4*5
*6*7*8*9
10*11*12*
*13*14*15
16*17*18*19*20
*/

class Question27
{
	public static void main(String[] arge)
	{
	int x = 1;
	for (int i=1;i<=5;i++)
	{
		for (int j =1;j<=5;j++)
		{
			if (i == 3)
			{
				System.out.print(x+"*");
				x++;
			}
			else if ( i%2 == 0)
			{
				System.out.print("*"+x);
				x++;
			}
			else if (j == 5 || i==5)
			{
				System.out.print(x++);
				
			}
			else
			{
				System.out.print(x+"*");
				x++;
			}
		}
		System.out.println();
	}
	}
}