package Week04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Week3and4Assignment {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//	a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		//	b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		//	c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int result = ages[ages.length - 1] - ages[0]; 
			//System.out.println(result);
		
			ages [ages.length - 1] = 37;
			int result2 = ages[ages.length - 1] - ages[0];
		
		//System.out.println(result2);
		
		double sum = 0; 
		for (int number : ages) {
				sum += number;
				//System.out.println(sum + "sum");
				//System.out.println(number);
		} 
		double average = sum / ages.length;
		//System.out.println(average);
		
		//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//	a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		//	b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double averageOfLetters = 0;
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
			averageOfLetters = sumOfLetters / 6;
	
		}
		//System.out.println(averageOfLetters);
		

		
		for (String i : names) {
			
			System.out.print(i + " ");
		}
		System.out.println();
		//3.	How do you access the last element of any array?
		
		System.out.println(names[names.length - 1]);
		
		//4.	How do you access the first element of any array?
		
		//System.out.println(names[0]);
		
		//5.	Create a new array of int called nameLengths. 
		//Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] += names[i].length();
		} 
		
		
		for (int nameLength : nameLengths) {
			//System.out.print(nameLength + " ");
		}
		//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
		//Print the result to the console.
		int sumOfNames = 0;
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] += names[i].length();
			sumOfNames += names.length;
		}
		
		//System.out.println(sumOfNames);
		
		//7.
		
		System.out.println(multiplyString("3", 9));
		
		
	} //End of main method

//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	
	
		public static String multiplyString(String str, int num) {
			String  result = ""; 
			for (int i = 0; i < num; i++) {
				result += str;
			}
			return result;
			
		 

		}

}//End of class
