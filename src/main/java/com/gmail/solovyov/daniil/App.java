package com.gmail.solovyov.daniil;

import java.io.PrintStream;
import java.util.Scanner;

public class App {

	private final Scanner scanner;
	private final PrintStream ps;

	public App(Scanner scanner, PrintStream ps) {
		this.scanner = scanner;
		this.ps = ps;
	}

	public void run() {
		ps.print("Введите первое число: ");
		int operandOne = scanner.nextInt();
		ps.print("Введите второе число: ");
		int operandTwo = scanner.nextInt();
		ps.print("Введите операцию: ");
		String operator = scanner.next();
		ps.printf("Результат: %d", new SuperSimpleCalculator(operandOne, operandTwo, operator).calculate());
	}

	public static void main(String[] args) {
		new App(new Scanner(System.in), System.out).run();
	}
}
