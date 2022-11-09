package com.himalaya;

public class Shape {

	private final int edges;
	private final int vertices;
	private final String color;

	public Shape(int edges, int vertices, String color) {
		this.edges = edges;
		this.vertices = vertices;
		this.color = color;
	}

	public int getEdges() {
		return edges;
	}

	public int getVertices() {
		return vertices;
	}

	public String getColor() {
		return color;
	}

	public static Shape shapeCreator(int edges, int vertices, String color){
		return new Shape(edges, vertices, color);
	}
}
