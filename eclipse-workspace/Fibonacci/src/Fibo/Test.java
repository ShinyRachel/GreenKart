package Fibo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0;
int n2=1;
int n3 = 0,i;
//System.out.println(n1+" "+n2);
	
for (i=0;i<=10;i++)
	{ 
	System.out.println(n1);
	n3=n1+ n2;
		//System.out.println(n3);
		n1=n2;
		n2= n3;
	}
}}