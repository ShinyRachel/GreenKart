package star2;

public class star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i, j;
int n=10;
for(i=0;i<=n;i++)
{
	for(j=0;j<=n;j++)
	{
		if(i==0 && j==0||i==2 && j==1|| i==4 && j==2||i==6 && j==3||i==8 && j==4||i==10 && j==5||i==8 && j==6||i==6 && j==7||i==4 && j==8||i==2 && j==9||i==0 && j==10)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
}
	}

}
