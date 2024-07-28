package lambdaPrograms;

import java.util.List;

public class PrintPrograms {

	
	public static void main(String args[]) {
		
		/*
		PrintPrograms.printString(
					  List.of("h spring","spring d","spring boot","boot"));
		*/
		
		PrintPrograms.printContainString
					  (List.of("h spring","spring d","spring boot","boot","bo"));
		
		PrintPrograms.printStringLen
		  (List.of("h spring","spring d","spring boot","boot","bo"));
		
		PrintPrograms.printDoubleIfEven
		  (List.of("h spring","spring d","spring boot","boot","bo"));
		
		
	}

	
	private static void printOdd(List<Integer> numbers){
		numbers.stream().
				filter(n -> n%2 != 0).
				forEach(System.out::println);
	}
	
	
	/*
	 * print all the strings individually
	 */
	private static void printString(List<String> StrList) {
		StrList.stream().
				forEach(System.out::println);
				
	}
	
	/*
	 * print string containing "spring"
	 */
	private static void printContainString(List<String> strList) {
		
		strList.stream().
				filter(s -> s.contains("spring")).
				forEach(System.out::println);

	}
	
	
	private static void printStringLen(List<String> strList) {
		strList.stream().
				filter(s -> s.length()>=4).
				forEach(System.out::println);
	}
	
	
	private static void printDoubleIfEven(List<String> listInt) {
		listInt.stream().
				filter(n -> n.length()>=4).
				map(n -> n+" and length is "+n.length()).
				forEach(System.out::println);
	}
	
	
}
