/*
6. Print an inverted pyramid with alternating numbers and stars.

7*8*9*10
  4*5*6
   2*3
    1
*/


class Question06
{
	public static void main(String[] arge)
	{
	int y =7;	
	for (int i=4;i>=1;i--)
	{
		for (int j=i;j< 4;j++)
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