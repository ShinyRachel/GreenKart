package OddEven;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements:");

		int n= sc.nextInt();
		
		System.out.println("Enter the " + n + " elements");
		int arr[]= new int [n];
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		for(i=0;i<arr.length;i++)
		{
			int z = arr[i];
						
			if (z%2==0)
				{
					System.out.println(z+ ":The number is an Even Number");
				}
				else
					
					{
						System.out.println(z+ ":The number is an Odd Number");
					}
			}
		}
	}
	

