/*
16. Print a right-angled triangle with numbers and stars at the edges.

1
1*2
1*2*3
1*2*3*4
1*2*3*4*5

*/


class Question16
{
	public static void main(String[] arge)
	{	
	for (int i=1;i<=5;i++)
	{
		for (int j=1;j<=i;j++)
		{
			if (i == j)
			{
				System.out.print(j);
			}
			else
			{
				System.out.print(j+"*");
			}
		}
		System.out.println();
	}
	}
}