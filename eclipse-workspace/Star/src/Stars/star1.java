package Stars;

public class star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int n=10;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1||i==5||i==10||i>=6 && j==10||i<=5 && j==1)//||i==7 && j==10||i==8 && j==10||i==9 && j==10||i==2 && j==1||i==3 && j==1||i==4 && j==1)
				{
				System.out.print("*   ");
			}
				else
				{
					System.out.print("    ");
				}
		}
			System.out.println();
			}

	}

}

