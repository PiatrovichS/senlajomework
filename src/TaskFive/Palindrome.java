package TaskFive;

/*
  ������� 5
���������� �������� ���������, ������� ��������� ����� �� "��������������". ����� ��� �������� �������� ������� �� ����� ���������� ���������. 

 */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ��� �������� �� ���������:");
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
			System.out.println("���� ����� ���������!");
		} else {
			System.out.println("���� ����� �� ���������!");
		}
		return s.equals(reverseString(s));

	}

}
