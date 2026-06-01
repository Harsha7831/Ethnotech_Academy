class Joggedarr
{
	public static void main(String args[])
	{
		int[][] marks = new int[5][];
		marks[0] = new int[1];
		marks[1] = new int[2];
		marks[2] = new int[3];
		marks[3] = new int[5];
		marks[4] = new int[3];
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				marks[i][j] = (i+10)*(j+20);
			}
		}
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
	}
}