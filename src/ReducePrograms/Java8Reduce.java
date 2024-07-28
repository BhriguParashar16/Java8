package ReducePrograms;

import java.util.List;

public class Java8Reduce {

	public static void main(String args[]) {
		List<Integer> listInt = List.of(1, 2, 3, 4, 5);

		Java8Reduce.calSum(listInt);
		
		
		System.out.println("This is Java 7 Functions");
		
		System.out.print(Java7Functions.returnComparatorList());

	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int calSum(List<Integer> lstNum) {

		return lstNum.stream().reduce(0, Java8Reduce::sum);

	}

	private static int reduce1(List<Integer> lstNum2) {
		return lstNum2.stream().reduce(0, (x, y) -> x);
	}

	private static int reduce2(List<Integer> lst) {
		return lst.stream().reduce(0, (x, y) -> y);
	}

	/*
	 * Calculate the maximum in the list
	 */
	private static int maxReduce(List<Integer> listMax) {
		return listMax.stream().reduce(Integer.MIN_VALUE, (x, y) -> Math.max(x, y));
	}

	/*
	 * Square every number and find the sum of squares
	 */
	private static int SquareNum(List<Integer> listForSum) {

		// wrong as it would aggregate
		// return listForSum.stream().reduce(0,(x,y)->x*x+y*y);

		return listForSum.stream().map(x -> x * x).reduce(0, (x, y) -> x + y);
	}

	/*
	 * Sum of all the odd numbers in the list
	 */
	private static int SumOfOdd(List<Integer> listForSum) {

		// wrong as it would aggregate
		// return listForSum.stream().reduce(0,(x,y)->x*x+y*y);

		return listForSum.stream().
				filter(x -> x%2==1).reduce(0, (x, y) -> x + y);
	}

}
