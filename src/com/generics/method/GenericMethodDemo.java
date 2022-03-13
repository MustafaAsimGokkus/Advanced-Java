package com.generics.method;
import java.awt.Point;

public class GenericMethodDemo {

	public static void main(String[] args) {
	
		
		Integer [] intArray = {1,2,3,4,5};
	Double [] doubleArray = {3.4,3.7,100.1,24.58,78.01};
    Point [] points = {new Point(10,10),new Point(20,32),new Point(-27,12)};
	}

	public <T> void printElements(T[] arr) {
		for (int i=0; i<arr.length;i++) {
			System.out.println(" "+arr[i]);
		}
	}
	
}
