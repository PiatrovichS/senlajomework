package TaskFour;

/*
  Задание 4
Необходимо написать рекурсивный алгоритм для нахождения НОД и НОК двух чисел. Два числа вводятся вручную во время выполнения программы.
 */

import java.util.Scanner;

public class Multiple {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число: ");
		int fi = sc.nextInt();
		System.out.println("Введите второе число: ");
		int si = sc.nextInt();
		System.out.println("Наибольший общий делитель: " + NOD(fi, si));
		System.out.println("Наименьшее общее кратно чисел: " + NOK(fi, si));
		sc.close();
	}

	static int NOD(int fi, int si) {
		int min;
		int nod = 0;
		if (fi > si)
			min = si;
		else
			min = fi;
		for (int count = 1; count <= min; count++) {
			if (fi % count == 0 && si % count == 0) {
				if (count > nod)
					nod = count;
			}
		}
		return nod;
	}

	static int NOK(int fi, int si) {
		int nok = 0;
		int count = 1;
		while (nok == 0) {
			if (count % fi == 0 && count % si == 0)
				nok = count;
			count++;
		}
		return nok;
	}
}
