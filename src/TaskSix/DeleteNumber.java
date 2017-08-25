package TaskSix;
/*
  Задание 6
Необходимо написать программу, которая удаляет из текста числа. Текст вводится вручную во время выполнения программы. 
 */

import java.util.Scanner;

public class DeleteNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите свой текст: ");
		String self = sc.nextLine();

		String result = self.replaceAll("[0-9]*", "");
		System.out.println("Ваш текст без цифр выглядит так!");
		System.out.println(result);
		sc.close();
	}
}