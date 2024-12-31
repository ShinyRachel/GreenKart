package Small;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {100,54,87,9,74};
int min=arr[0],i;
for (i=0;i<arr.length;i++) {
	if (min>arr[i]) 
		min=arr[i];
}
System.out.println("Smallest element in given array:");
System.out.println (min);
	

}}
