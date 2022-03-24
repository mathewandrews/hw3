package HW3;

import java.util.*;

public class Main
{
	public static void addFirst(int n){
		ArrayList<Integer> array = new ArrayList<Integer>(n);
		long startingTime = System.currentTimeMillis();
		for (int i =1; i<=n; i++)
		{
			array.add(0,i);
		}
		long endTime = System.currentTimeMillis();
		long timeElapsed = (endTime - startingTime);
		System.out.println("Total time taken to add n elements at the beginning = " + timeElapsed + "ms");
	}
	public static void addMiddle(int n){
		ArrayList<Integer> array = new ArrayList<Integer>(n);
		long startingtime = System.currentTimeMillis();
		for (int i = 1; i<= n; i++)
		{
			array.add((array.size()/2), i);
		}
		long endTime = System.currentTimeMillis();
		long timeElapsed = (endTime - startingtime);
		System.out.println("Total time taken to add n elements in the middle = " + timeElapsed + "ms");
	}
	public static void addEnd(int n){
		ArrayList<Integer> array = new ArrayList<Integer>(n);
		long startingtime = System.currentTimeMillis();
		for (int i = 1; i<= n; i++)
		{
			array.add(array.size(),i);
		}
		long endTime = System.currentTimeMillis();
		long timeElapsed = (endTime - startingtime);
		System.out.println("Total time taken to add n elements in the end = " + timeElapsed + "ms");
	}
	public static void main(String[] args) {
		for (int i = 100000; i <= 10000000; i += 100000) {
			System.out.println("results for n = " + i);
			addFirst(i);
			addMiddle(i);
			addEnd(i);
		}
	}
}
