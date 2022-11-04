/* Month.java: Reads an integer input and prints corresponding month

Name: Nicole Issagholian

Date: 9/27/2021
*/

import java.util.Scanner;

public class Month
{
	public static void main(String[] args)
	{
		//creates a Scanner object
		Scanner data = new Scanner(System.in);

		//asks the user to input an integer
		System.out.println("Enter a number from 1 to 12: ");

		//Reads user input
		int month = data.nextInt();

		//prints the month corresponding to the input using if, else if, and else loops
		if (month == 1)
		{
			System.out.println("January");
		}
		else if (month == 2)
		{
			System.out.println("February");	
		}
		else if (month == 3)
		{
			System.out.println("March");
		}
		else if (month == 4)
		{
			System.out.println("April");
		}		
		else if (month == 5)
		{
			System.out.println("May");
		}
		else if (month == 6)
		{
			System.out.println("June");
		}
		else if (month == 7)
		{
			System.out.println("July");
		}	
		else if (month == 8)
		{
			System.out.println("August");
		}
		else if (month == 9)
		{
			System.out.println("September");
		}
		else if (month == 10)
		{
			System.out.println("October");
		}
		else if (month == 11)
		{
			System.out.println("November");
		}	
		else if (month == 12)
		{
			System.out.println("December");
		}
		else 
		{
			System.out.println("Invalid month number");
		}					
	}
}

