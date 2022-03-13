package com.generics.classes;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String>map = new HashMap<>();
		
		map.put(1, "John");
		map.put(2, "Vali");
		map.put(3, "Jo");
		
		System.out.println(map.get(1));
		
	}

}
