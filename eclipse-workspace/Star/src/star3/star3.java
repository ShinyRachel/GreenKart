package star3;

public class star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=10;
for(i=0;i<=n;i++) 
{
	for(j=1;j<=n;j++)
	{
		if(i==0||j==5||i==10 && j<=5)
		{
			System.out.print("*  ");
		}
		else
		{
			System.out.print("   "
					+ "");
		}
	}
	System.out.println();
}
	}

}
