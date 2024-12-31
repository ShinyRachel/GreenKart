package Star;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i, j;
int n=7;
for(i=1;i<n;i++)
{
	for(j=1;j<n;j++)
	{
		if(j==1||j==n-1||i==j||i+j==n)
		{
		System.out.print("* ");
	}
		else
		{
			System.out.print("  ");
		}
}
	System.out.println();
	}

}}
