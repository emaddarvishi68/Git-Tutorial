package com.emad;

public class Calculator {

	public static void div() {
		int A[] = { 1, 2, 3 };

		int result = 5 / 0;// divided by 0
		int arrOut = A[0] + A[4];// index out of bound
		System.out.println(arrOut);
		System.out.println(result);

	}

	public static void main(String[] args) {
		div();
	}

}
