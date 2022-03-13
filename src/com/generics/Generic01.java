package com.generics;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Generic01 {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("Hello Generic");
		list.add(2022);
		list.add(new Point(200,200));

		String str = (String)list.get(0);
		System.out.println(str);
		
		for(Object object :list) {
			System.out.println(object);
		}
		
		List <String> listStr = new ArrayList <>();
		listStr.add("Hello Generics");
		listStr.add("Hello Java");
		
		List<String> listStr1 =new ArrayList<String>();
		List<Integer> listInt =new ArrayList<>();
		
		
	}

}
