package example;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int number ; // You can change this to any number you want to check
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        sc.close();
        if (isArmstrong(number)) {
            System.out.println(number + " is a Armstrong number.");
        } else {
            System.out.println(number + " is not a Armstrong number.");
        }
	}
    public static boolean isArmstrong(int z)
    {
    	int originalno = z;
    	int result=0;
    	int digitslen = String.valueOf(z).length();
    	while(z!=0)
    	{
    		int digits=z%10;
    		result+=Math.pow(digits,digitslen);
    		z=z/10;
    	}
    	return result==originalno;
    }
}		
    	
