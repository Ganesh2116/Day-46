/*
5. Print a pyramid with alternating numbers and stars.

    1
   2*3
  4*5*6
 7*8*9*10
*/


class Question05
{
	public static void main(String[] arge)
	{
	
	int n = 1;
	for (int i=1;i<=7;i+=2)
	{
		for (int j=7;j>=i;j-=2)
		{
			System.out.print(" ");
		}

		for (int j=i;j>=1;j--)
		{
			if (j%2 != 0)
			System.out.print(n++);
			else
			System.out.print("*");
		}
		System.out.println();
	}
	}
}