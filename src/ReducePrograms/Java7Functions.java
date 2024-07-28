package ReducePrograms;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java7Functions {

	public static List<Integer> returnDistinctSort() {

		List<Integer> listInt = List.of(1, 2, 3, 4, 5, 6);

		return listInt.stream()
					  .distinct().sorted().collect(Collectors.toList());

	}

	public static List<Integer> returnComparatorList() {

		List<Integer> listInt = List.of(1, 2, 3, 12, 5, 6);

		return listInt.stream()
					  .sorted().toList();

	}

	public static List<Integer> returnEvenList() {

		List<Integer> listInt = List.of(1, 2, 3, 12, 5, 6);

		return listInt.stream()
					  .filter(x->x%2==0).collect(Collectors.toList());
		
	}
	
	
	
	public static void sortEvenNumbers(){
		
		List<Integer> sortList=List.of(2,1,45,6,35,90,6);
		
		
		/*
		 * Used to test something
		 */
		Predicate<Integer> isEvenpredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x%2==0;
			}
		}; 
		
		
		
		Function<Integer,Integer> doSquare = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t=t*t;
			}
		};
		
		
		Consumer<Integer> consumeVal=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		
		sortList.stream()
				.filter(isEvenpredicate2)
				.map(doSquare)
				.forEach(consumeVal);
	}
}
