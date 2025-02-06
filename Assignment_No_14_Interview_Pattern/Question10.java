/*
10. Print a pattern with alternating rows of stars and numbers in reverse.

12345
****
123
**
1
*/


class Question10
{
	public static void main(String[] arge)
	{
	for (int i=5;i>=1;i--)
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