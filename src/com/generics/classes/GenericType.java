package com.generics.classes;

public class GenericType <T> {
	
	
	private T t;
	
	
/**
	 * @return the t
	 */
	public T getT() {
		return t;
	}


	/**
	 * @param t the t to set
	 */
	public void setT(T t) {
		this.t = t;
	}


public static void main(String[] args) {
	
	GenericType<String> obj = new GenericType();
	
	obj.setT("John");
	System.out.println(obj.getT());	
}
}
