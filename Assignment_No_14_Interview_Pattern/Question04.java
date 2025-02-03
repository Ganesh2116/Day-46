/*
4. Print a diamond shape with numbers and stars.

   1
  2*3
 4*5*6
7*8*9*10
 4*5*6
  2*3
   1
*/


class Question04
{
	public static void main(String[] arge)
	{
	int n = 1;
	for (int i=1;i<=7;i=i+2)
	{
		for (int j=7;j>=i;j=j-2)
		{
			System.out.print(" ");
		}
		for (int j=1;j<=i;j++)
		{
			
			if (j%2 != 0)
			System.out.print(n++);
			else 
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	int nn = 4;
	for (int i=5;i>=1;i=i-2)
	{
		for (int j=i;j<=5;j=j+2)
		{
			System.out.print(" ");
		}

		for (int j=1;j<=i;j++)
		{
			
			if (j%2 != 0)
			System.out.print(nn++);
			else 
			System.out.print("*");
			
		}
		nn = nn - 5;
		System.out.println();
	}


	}
}