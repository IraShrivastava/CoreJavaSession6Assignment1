package assignment6;	//package declaration
import java.util.Scanner;
public class Assignment6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];		//creates an array of 10 elements of integer type and assigns its reference to array variable arr
		Scanner in=new Scanner(System.in);		//scanner to take input from the user
		System.out.println("Enter 10 elements into array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();	//assigning value to arr[i]
		}
		System.out.println();
		System.out.println("Even Numbers in Array");
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2==0)		//condition to check if element present at arr[j] is even
				System.out.println(arr[j]);
		}
	}

}
