/*
23. Print a zigzag pattern with numbers and stars.

1*2
*3*4
5*6
*7*8
*/


class Question23
{
	public static void main(String[] arge)
	{
	int x = 1;

	for (int i=1;i<=4;i++)
	{
		for (int j=1;j<=1;j++)
		{
			if (i%2 != 0)
			{	
															System.out.print(x+"*");
				x++;
				System.out.print(x++);

			}
			else 
			{
				System.out.print("*"+x);
				x++;
				System.out.print("*"+x);
				x++;
			}		
		}
		System.out.println();
	}
	}
}