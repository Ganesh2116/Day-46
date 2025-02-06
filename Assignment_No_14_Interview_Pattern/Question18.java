/*
18. Print a mirrored right-angled triangle with numbers and stars.

    1
   2*3
  4*5*6
 7*8*9*10
*/


class Question18
{
	public static void main(String[] arge)
	{
	int x =1;	
	for (int i=1;i<=4;i++)
	{
		for (int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for (int j=1;j<=i;j++)
		{
			if (i == j )
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