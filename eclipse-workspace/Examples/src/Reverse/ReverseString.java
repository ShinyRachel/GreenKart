package Reverse;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str;
	        System.out.println("Enter your username: ");
	        Scanner scanner = new Scanner(System.in);
	        str = scanner.nextLine();
	        scanner.close();
	        String reversed = reverseStr(str);
	        System.out.println("The reversed string is: " + reversed);
	    }
	public static String reverseStr(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseStr(str.substring(1)) + str.charAt(0);
	}

}
