package com.himalaya;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	private int a1 = 1, a2 = 1;
	private int counter=0;
	private final List<Integer> fibonacciSeries = new ArrayList<>();

	public void fibonacciList(int number) {

		fibonacciSeries.add(1);
		fibonacciSeries.add(1);


		while (counter<number){

			int a3 = a1+a2;
			fibonacciSeries.add(a3);
			a1=a2;
			a2=a3;
			counter++;
		}
	}

	public void printList(){
		int count=1;
		for(int i: fibonacciSeries){
			System.out.println(count + ": " + i);
			count++;
		}
	}
}

class Himalaya{
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.fibonacciList(50);
		f.printList();
	}
}