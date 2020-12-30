package Core_Java_Examples;

import java.util.Scanner;

public class IntegerToString {

	public static void getNum(char ch)
	{
			switch (ch) {
			case '0':
				System.out.println("Zero");				
				break;
			case '1':
				System.out.println("One");				
				break;
			case '2':
				System.out.println("Two");				
				break;
			case '3':
				System.out.println("Three");				
				break;
			case '4':
				System.out.println("Four");				
				break;
			case '5':
				System.out.println("Five");				
				break;
			case '6':
				System.out.println("Six");				
				break;
			case '7':
				System.out.println("Seven");				
				break;
			case '8':
				System.out.println("Eight");				
				break;
			case '9':
				System.out.println("Nine");				
				break;
			default:
				break;
			}
		
	}
	
	
	public static void printVal(String N)
	{
		int size = N.length();
		int i =0;
		for(i=0; i<size; i++)
		{
			getNum(N.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		
		String N = "1234";
		printVal(N);
		
	}

}
