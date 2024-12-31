package star4;

public class star4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i,j;
 int n=10;
for(i=0;i<=n;i++)
{
	for(j=0;j<=n;j++)
	{
		if(i==0||i==5||j==0||i<=5 && j==10||i==6 && j==1||i==7 && j==3||i==8 && j==5||i==9 && j==7||i==10 && j==9)
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
	
	}

}
