package com.calculator.calculator;


import org.jetbrains.annotations.Contract;

public class CalculatorApplication {

	@Contract(pure = true)
	public static int main(String[] args) {
		public int addAToB(int a, int b){
			int i = a + b;
			return i;

		}
		public int subtractAFromB(int a, int b){
			int n = a - b;
			return n;
		}

	}

}
