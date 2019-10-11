package main;

import java.util.ArrayList;
import java.util.List;

public class Loops {

	public int max(List<Integer> nums) {

		int max = Integer.MIN_VALUE;

		for (int i : nums) {
			max = Math.max(max, i);
		}
		return max;
	}

	public int min(List<Integer> nums) {
		int min = Integer.MAX_VALUE;

		for (int i : nums) {
			min = Math.min(min, i);
		}
		return min;
	}

	public List<Integer> evens(List<Integer> nums) {
		List<Integer> evens = new ArrayList<>();

		for (int i : nums) {
			if (i % 2 == 0) {
				evens.add(i);
			}
		}
		return evens;
	}

	public List<Integer> odds(List<Integer> nums) {
		List<Integer> odds = new ArrayList<>();

		for (int i : nums) {
			if (i % 2 != 0) {
				odds.add(i);
			}
		}
		return odds;
	}

	public int sum(List<Integer> nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		return sum;
	}

	public int squareOddMin(List<Integer> nums) {
		List<Integer> squaredEvens = new ArrayList<>();
		for (int i : nums) {
			squaredEvens.add(i * i);
		}
		return this.min(this.odds(squaredEvens));
	}
}
