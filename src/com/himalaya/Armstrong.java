package com.himalaya;

public class Armstrong {

	private int count=0;


	public boolean returnArmstrong(int number){

		int value = number;

		while(number>0){
			int remainder = number%10;
			count += remainder*remainder*remainder;
			number = number/10;
		}

		return count== value;
	}
}

class HimalayaGoswami{
	public static void main(String[] args) {

		Armstrong a = new Armstrong();
		System.out.println(a.returnArmstrong(153));


	}
}
