/*
9. Print a pattern with alternating rows of stars and numbers.

1
**
123
****
12345
*/

class Question09
{
	public static void main(String[] arge)
	{
	for (int i=1;i<=5;i++)
	{
		int num = 1;
		for (int j=1;j<=i;j++)
		{
			if (i%2 !=0)
			System.out.print(num++);
			else 
			System.out.print("*");
		}
		System.out.println();
	}
	}
}