package com.himalaya;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumbers {

	private final Set<Integer> primeNumbers = new HashSet<>();

	private boolean primeNumberFinder(int number){
		int count=0;
		for(int i=1; i<=number; i++){

			if((number%i==0)) {
				count++;
			}
		}
		return count == 2;
	}
	/*
	* Write a method to print all prime numbers before the input number*/

	public void primeListCreator(int number){


		for(int i=2; i<=number; i++){
			if(primeNumberFinder(i)){
				primeNumbers.add(i);
			}
		}
	}

	public void listPrinter(){
		int count=1;
		for(int i: primeNumbers){
			System.out.println(count + ": " +i);
			count++;
		}
	}
}






















