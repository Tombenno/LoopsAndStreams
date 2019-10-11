package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LoopsAndStreams {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter something: ");
		String input = scan.nextLine();
		System.out.println("Input: " + input);
		scan.close();
		
		//String to int
		//int i = Interger.parseInt("44");
		
		//Pythagoras
		//Math.hyp(4, 5);
		
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 19, 75, 91, 124, 52, 63, 45, 61, 96, 47, 27, 16);
		Loops loops = new Loops();
		System.out.println("====================");
		System.out.println("Time for Loops");
		System.out.println("-------------------");
		System.out.println("Max: " + loops.max(nums));
		System.out.println("Min: " + loops.min(nums));
		System.out.println("Evens: " + loops.evens(nums));
		System.out.println("Odds: " + loops.odds(nums));
		System.out.println("Sum: " + loops.sum(nums));
		System.out.println("Odd Squared Min: " + loops.squareOddMin(nums));
		System.out.println("====================");

		Streams streams = new Streams();

		System.out.println("Time for Streams");
		System.out.println("-------------------");
		System.out.println("Max: " + streams.max(nums));
		System.out.println("Min: " + streams.min(nums));
		System.out.println("Evens: " + streams.evens(nums));
		System.out.println("Odds: " + streams.odds(nums));
		System.out.println("Sum: " + streams.sum(nums));
		System.out.println("Odd Squared Min: " + streams.squareOddMin(nums));
		System.out.println("====================");
	}
}
