package main;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public int max(List<Integer> nums) {
		return nums.stream().reduce(Math::max).get();
	}

	public int min(List<Integer> nums) {
		return nums.stream().reduce(Math::min).get();
	}

	public List<Integer> evens(List<Integer> nums) {
		return nums.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
	}

	public List<Integer> odds(List<Integer> nums) {
		return nums.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
	}

	public int sum(List<Integer> nums) {
		return nums.stream().reduce((a, b) -> a + b).get();
	}

	public int squareOddMin(List<Integer> nums) {
		return nums.stream().map(a -> a * a).filter(i -> i % 2 != 0).reduce(Math::min).get();
	}

}
