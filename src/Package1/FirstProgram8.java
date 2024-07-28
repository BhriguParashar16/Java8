package Package1;

import java.util.List;

public class FirstProgram8 {

	public static void main(String args[]) {
		
		printAll(List.of(12,3,4,5,4));
	}
	
	private static void print(int number) {
		System.out.println(number);
	}
	
	private static Boolean isEven(int num) {
		return num %2 ==0;
	}
	
	private static void printAll(List<Integer> numbers) {
		
		
		/*
		 * Printing the number
		 */
		
		//1.
		
		numbers.stream().forEach(FirstProgram8::print);
		
		
		//2. println is the static method present in the System.out
		
		numbers.stream().forEach(System.out::println);
		
		
		/*
		 * printing the Even number
		 */
		
		
		//3. Print the even numbers present in the List
		
		numbers.stream().
				filter(FirstProgram8::isEven).  // we are not calling , only we are telling to allow only even numbers further:: -->Check
				forEach(System.out::println);
		
		
		//4. filter + Lambda Expression
		numbers.stream().
				filter(n -> n%2==0).			// check that number according to that condition
				forEach(System.out::println);
		
		/*
		 * Lambda Expression is the simplified version of function 
		 */
				
				
		/*
		for(int num:numbers) {
			System.out.println(num);
		}
		*/
	}
}
