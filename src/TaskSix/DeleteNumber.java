package TaskSix;
/*
  ������� 6
���������� �������� ���������, ������� ������� �� ������ �����. ����� �������� ������� �� ����� ���������� ���������. 
 */

import java.util.Scanner;

public class DeleteNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���� �����: ");
		String self = sc.nextLine();

		String result = self.replaceAll("[0-9]*", "");
		System.out.println("��� ����� ��� ���� �������� ���!");
		System.out.println(result);
		sc.close();
	}
}