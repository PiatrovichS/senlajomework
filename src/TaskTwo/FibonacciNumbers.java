package TaskTwo;

/*
 * Задание 2
Необходимо написать программу, которая вычисляет числа Фибоначчи в пределах от 1 до N. N – вводится вручную во время выполнения программы.
 */

import java.util.Scanner;

public class FibonacciNumbers {

	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	private int[] fiboElem = new int[n];

	public FibonacciNumbers() {}
	
	public void calcFibo() {
		fiboElem[0] = 0;
		fiboElem[1] = 1;
		for (int i = 2; i < n; i++) {
			fiboElem[i] = fiboElem[i - 1] + fiboElem[i - 2];
		}
	}

	public void showAllFibo() {
		for (int i = 0; i < n; i++) {
			System.out.println(fiboElem[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Введите число:");
		FibonacciNumbers fibonacci = new FibonacciNumbers();
		fibonacci.calcFibo();
		System.out.println("Ваши числа Фибоначчи:");
		fibonacci.showAllFibo();
	}
}
