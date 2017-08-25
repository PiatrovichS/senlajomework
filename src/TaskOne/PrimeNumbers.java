package TaskOne;

/*
  ������� 1
���������� �������� ���������, ������� ��������� ������� ����� � �������� �� 1 �� N. N � �������� ������� �� ����� ���������� ���������.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		IsPrime myIsPrime = new IsPrime();
		System.out.print("������� �����: ");
		myIsPrime.setLimit();
		myIsPrime.getAllPrimes();
		System.out.println("������� ����� � ���������: ");
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
			System.out.println("����� ������ ���� ������ 2!");
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