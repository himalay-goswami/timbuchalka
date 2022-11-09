package com.himalaya;

public class Main {
	public static void main(String[] args) {

/*
		PrimeNumbers p = new PrimeNumbers();

		p.primeListCreator(789);
		p.listPrinter();

		p.primeListCreator(1111);
		p.listPrinter();
*/


		Shape shape = Shape.shapeCreator(2,3, "red");
		System.out.println(shape.getColor());
		System.out.println(shape.getEdges());


	}
}