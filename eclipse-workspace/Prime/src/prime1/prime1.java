package prime1;

public class prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,ct=0;
int n=100;

//if(0<=1)
//{
//	System.out.println(0 + ":is not a prime number");
//}
//if(1<=1)
//{
//	System.out.println(1 + ":is not a prime number");
//}
for(i=2;i<=n;i++)
{
	int flag=0;
	for(j=2;j<Math.sqrt(i);j++)
	{
		if(i%j==0)
		{
			flag=1;
			ct++;
			//System.out.println(ct);
			break;
		}
	}
	if(flag==0)
	{
		System.out.println(i+ ":is a prime number");
	}
}
	}

}
