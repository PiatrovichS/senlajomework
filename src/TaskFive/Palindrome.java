package TaskFive;

/*
  Задание 5
Необходимо написать программу, которая проверяет слово на "палиндромность". Слово для проверки вводится вручную во время выполнения программы. 

 */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слово для проверки на полиндром:");
		String s = sc.next();
		isPalindrome(s);
		sc.close();
	}

	public static String reverseString(String s) {
		String r = "";
		for (int i = s.length() - 1; i >= 0; --i)
			r += s.charAt(i);
		return r;

	}

	public static Boolean isPalindrome(String s) {
		if (s.equals(reverseString(s))) {
			System.out.println("Ваше слово полиндром!");
		} else {
			System.out.println("Ваше слово не полиндром!");
		}
		return s.equals(reverseString(s));

	}

}
