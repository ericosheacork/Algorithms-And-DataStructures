/**
 * Imports section: Import the random library for ex3
 */
import java.util.Random;
import java.util.Scanner;

/**
 * The class contains the 8 methods to fulfill in the exam. 
 * @author Ignacio.Castineiras
 *
 */
public class exercises {

	//----------------------------------------------
	// Class constructor
	//----------------------------------------------	
	/**
	 * Constructor of the class. Do not edit it.
	 */
	public exercises(){}
		
	//----------------------------------------------
	// ex1
	//----------------------------------------------	
	/**
	 * The function prints your name by the screen.<br>
	 * Example: In my case it will print Nacho Castineiras
	 */
	public void ex1(){
		String name;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("hello whats your name");
		name = keyboard.nextLine();
		
		System.out.println("HELLO " + name + "!!!!");
	}
	
	//----------------------------------------------
	// ex2
	//----------------------------------------------	
	/**
	 * The function declares a new variable res, assigns it to the sum of 'a' and 'b' and returns res.<br>
	 * Example: If a = 3 and b = 5 then it returns 8 (which is 3 + 5)
	 * @param a: First Integer
	 * @param b: Second Integer  
	 * @return Sum of a and b
	 */
	public int ex2(int a, int b){
		int result;
		a = 43;
		b = 56;
		
		result = a + b;
		System.out.println(result);
		return result;
			
	}
	
	//----------------------------------------------
	// ex3
	//----------------------------------------------	
	/**
	 * The function receives 3 numbers and prints by screen the biggest of them.<br>
	 * Example: If a = 3, b = 7 and c = 5, then it prints 7 (which is the biggest of the 3 numbers). 
	 * @param a: First number
	 * @param b: Second number
	 * @param c: Third number
	 * 
	 */
	public void ex3(int a, int b, int c){
		int first = 23;
		int second = 67;
		int third = 87;
		
		if (first > second && first > third)
		{
			System.out.println(first + " is the biggest bumber");
		}
		
		else if(second > first && second >third)
		{
			System.out.println(second + " is the biggest number");
		}
		
		else if(third > second && third > first)
		{
			System.out.println(third + " is the biggest number");
		}
		
		else 
		{
			System.out.println("Something went wrong");
		}
		
	}
	
	//----------------------------------------------
	// ex4
	//----------------------------------------------	
	/**
	 * The function returns the sum of all numbers from 1 to n.<br>
	 * Example: If n = 5, the function returns 15 (which is 1 + 2 + 3 + 4 + 5).
	 * @param n: Number we want to stop adding at
	 * @return Sum of all integers in [1..n]
	 * 
	 */
	public int ex4(int n){
		
		int sum = 0;
		
			
			System.out.println("What number would you like me to add up to");
			n = 5;
			//n = keyboard.nextInt();
			
		
		for(int i = 0; i <= n; i++)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);
		return sum;
		
			}	
	
	//----------------------------------------------
	// ex5
	//----------------------------------------------	
	/**
	 * The function prints a pattern by screen.<br>
	 * Example1: If n = 3, then it prints<br>
	 * *<br>
	 * **<br>
	 * ***<br>
	 * Example2: If n = 5, then it prints<br>
	 * *<br>
	 * **<br>
	 * ***<br>
	 * ****<br>
	 * *****<br>
	 * 
	 * @param n: Number of lines to be printed
	 * 
	 */
	public void ex5(int n){
		int counter;
		int limit;
		int starNum;
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("How many level of stars would you like?");
			starNum = keyboard.nextInt();
			
			for(limit = 0; limit  < starNum; limit++)
			{
				for(counter = 0; counter <= limit; counter++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}	

	//--------------------------------------------------
	// ex6
	//--------------------------------------------------
	/**
	 * 
	 * The function reverses a String and returns the String reversed.<br> 
	 * Example: If the String "Hello" is received, then it returns "olleH"
	 * 
	 * @param s: String to be scanned. 
	 * @return The reversed String.
	 * 
	 */
	public String ex6(String s){
//		s = "mary had a little lamb";
//		int i = 0;
//		char[] seperated = s.toCharArray();
//		int startpoint = (seperated.length);
//		
//		System.out.println("`the sentence is " +  seperated.length + " characters long.");
//		while(i <= seperated.length)
//		{
//			System.out.println(seperated[startpoint - -i]);
//			i++;
//		}
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String sentence = keyboard.nextLine();
		String reverse = "";
		
		for(int i = sentence.length() -1; i >=0; i--)
		{
			reverse = reverse + sentence.charAt(i);
		}
		
		System.out.println("Here is your new string");
		System.out.println(reverse);
		
		
		
		
		
		
		return reverse;
	}	
	
	//----------------------------------------------
	// ex7
	//----------------------------------------------	
	/**
	 * NOTE: This exercise has been taken from CodeWars:<br>
	 * https://www.codewars.com/kata/sum-of-digits-slash-digital-root<br>
	 * Description:<br>
	 * A digital root is the recursive sum of all the digits in a number.<br>
	 * Given n, take the sum of the digits of n.<br>
	 * If that value has still more than one digit, continue reducing in this way until a single-digit number is produced.<br><br>
	 * Example 1:<br>
	 * ex7(16)<br>
	 * 1 + 6<br>
	 * 7<br><br>
	 * 
	 * Example 2:<br>
	 * ex7(942)<br>
	 * 9 + 4 + 2<br>
	 * 15<br>
	 * However, as 15 still contains more than one digit, we iterate again<br>
	 * 1 + 5<br>
	 * 6
	 * 
	 * @param n: Number to apply its digital root to.
	 * @return res: Digital result of the number.
	 */	
	public int ex7(int n) {
	        int num = 640;
	        String first_Step = Integer.toString(num);
	        char a = first_Step.charAt(0);
	        char b = first_Step.charAt(1);
//	             char c = first_Step.charAt(2);

	        int first = Integer.parseInt(String.valueOf(a));
	        int second = Integer.parseInt(String.valueOf(b));
//	           int third = Integer.parseInt(String.valueOf(three));

	        System.out.println(first + " + " + second);
	        int sum = first + second;
	        System.out.println(sum);
	        int second_step = sum;

	        if (sum >= 10);
	        {
	            while (sum >= 10)
	            {
	                String next_Step = Integer.toString(second_step);
	                char A = next_Step.charAt(0);
	                char B = next_Step.charAt(1);

	                int first_digit = Integer.parseInt(String.valueOf(A));
	                int secon_digit = Integer.parseInt(String.valueOf(B));
	                sum = first_digit + secon_digit;

	                System.out.println(first_digit + " + " +  secon_digit);
	                System.out.println(sum);
	            }

	        }
		
		return sum;
	}		
	
}
