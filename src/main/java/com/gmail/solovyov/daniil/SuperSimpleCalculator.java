package com.gmail.solovyov.daniil;

public class SuperSimpleCalculator {

	private final Integer operandOne;
	private final Integer operandTwo;
	private final String operator;

	public SuperSimpleCalculator(Integer operandOne, Integer operandTwo, String operator) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operator = operator;
	}

	public Integer calculate() {
		switch (operator) {
			case "+":
				return operandOne + operandTwo;
			case "-":
				return operandOne - operandTwo;
			case "/":
				return operandOne / operandTwo;
			case "*":
				return operandOne * operandTwo;
			default:
				throw new IllegalArgumentException(String.format("Operation '%s' isn't supported", operator));
		}
	}
}
