package com.ananyev.task2;

public class Caunter {
	public static final long serialVersionUID = 42L;

	public double caltulate(String[] args) {
		
		double first = Double.parseDouble(args[0]);
		double second = Double.parseDouble(args[1]);
		double third = Double.parseDouble(args[2]);
		return (second + Math.sqrt(Math.pow(second, 2) + 4 * first * third) / (second * first))
				- (Math.pow(first, 3) * third + Math.pow(second, -2));
	}
}
