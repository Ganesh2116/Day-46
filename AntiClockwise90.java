// Rotation 90 Anticlockwise


class AntiClockwise90
{
	public static void main(String[] arge)
	{
	int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
	
	
	System.out.println("Matrix is:");
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr.length;j++)
		{
			System.out.print(arr[i][j]+" ");	
		}
		System.out.println();
	}
	
	System.out.println("90 Anticlockwise rotation:");
	for (int i=arr.length-1;i>=0;i--)
	{
		for (int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j][i]+" ");	
		}
		System.out.println();
	}
	}
}