package TaskOne;

/*
  Задание 1
Необходимо написать программу, которая вычисляет простые числа в пределах от 1 до N. N – вводится вручную во время выполнения программы.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		IsPrime myIsPrime = new IsPrime();
		System.out.print("Введите число: ");
		myIsPrime.setLimit();
		myIsPrime.getAllPrimes();
		System.out.println("Простые числа в интервале: ");
		myIsPrime.display();
	}
}

class IsPrime {
	private int limit;
	private ArrayList<Integer> numbers = new ArrayList<Integer>();

	private boolean isPrime(int num) {
		boolean flag = true;
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public void setLimit() {
		Scanner scanner = new Scanner(System.in);
		limit = scanner.nextInt();
		scanner.close();
	}

	public void getAllPrimes() {
		if (limit < 2) {
			System.out.println("Число должно быть больше 2!");
		} else {
			for (int i = 2; i <= limit; i++) {
				if (isPrime(i)) {
					numbers.add(i);
				}
			}
		}
	}

	public void display() {
		System.out.println(numbers);
	}

}