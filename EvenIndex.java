class EvenIndex
{
	public static void main(String args[])
	{
		int even=2;
		int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for(int i=0;i<6;i++)
		{
			if(i%2==0)
			{
				even *=array[i];
			}
			System.out.println("Even Index is:" +even);
		}
	}
}
				