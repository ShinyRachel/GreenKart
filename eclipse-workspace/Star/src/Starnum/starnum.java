package Starnum;

public class starnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j; 
int n=6;
for(i=1;i<=n;i++) //2;2<=6;3
{
	for(j=1;j<=n-i;j++) //4;4<=4;5
	{
		System.out.print(" ");
	}
	for(j=1;j<=i;j++) //1;1<=2;3
{
	System.out.print(i+" ");
}
System.out.println();	
}	}

}
