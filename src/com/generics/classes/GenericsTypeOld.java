package com.generics.classes;

public class GenericsTypeOld {
 
	private Object t;

	/**
	 * @return the t
	 */
	public Object getT() {
		return t;
	}

	/**
	 * @param t the t to set
	 */
	public void setT(Object t) {
		this.t = t;
	}
	public static void main(String[] args) {
		GenericsTypeOld obj = new GenericsTypeOld();
		obj.setT("John");
		
		String str = (String) obj.getT();
		System.out.println("Type name: "+str);
	}
}
