package com.generics.classes.bounded;

import java.util.Arrays;
import java.util.List;

public class WildCard {

	public static void main(String[] args) {
	List <Integer> li = Arrays.asList(1,2,3);
	System.out.println("sum="+WildCard.sumOfElements(li));

	}

	public static double sumOfElements (List <? extends Number> list) {
		double s = 0.0;
		for(Number n: list) {
			s+= n.doubleValue();
		}
		return s;
	}
	
	// ? has to be super of Integer
	public static void addNumber (List<? super Integer> list) {
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
	}
	
}
