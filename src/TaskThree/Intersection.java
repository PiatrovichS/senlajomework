package TaskThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  Задание 3
 Необходимо написать программу, которая определеет пересекаются ли два отрезка.
 Координаты отрезков вводятся вручную во время выполнения программы. 
 */

public class Intersection {
	public static void main(String[] args) throws IOException {
		BufferedReader readeder = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите координаты х для первой точки отрезка 1");
		float ax1 = Float.parseFloat(readeder.readLine());
		System.out.println("Введите координаты y для первой точки отрезка 1");
		float ay1 = Float.parseFloat(readeder.readLine());
		System.out.println("Введите координаты х для второй точки отрезка 1");
		float ax2 = Float.parseFloat(readeder.readLine());
		System.out.println("Введите координаты y для второй точки отрезка 1");
		float ay2 = Float.parseFloat(readeder.readLine());

		System.out.println("Введите координаты х для первой точки отрезка 2");
		float bx1 = Float.parseFloat(readeder.readLine());
		System.out.println("Введите координаты y для первой точки отрезка 2");
		float by1 = Float.parseFloat(readeder.readLine());
		System.out.println("Введите координаты х для второй точки отрезка 2");
		float bx2 = Float.parseFloat(readeder.readLine());
		System.out.println("Введите координаты y для второй точки отрезка 2");
		float by2 = Float.parseFloat(readeder.readLine());

		float v1 = (bx2 - bx1) * (ay1 - by1) - (by2 - by1) * (ax1 - bx1);
		float v2 = (bx2 - bx1) * (ay2 - by1) - (by2 - by1) * (ax2 - bx1);
		float v3 = (ax2 - ax1) * (by1 - ay1) - (ay2 - ay1) * (bx1 - ax1);
		float v4 = (ax2 - ax1) * (by2 - ay1) - (ay2 - ay1) * (bx2 - ax1);

		if ((v1 * v2 <= 0) && (v3 * v4 <= 0)) {
			System.out.println("Отрезки пересекаются!");
		} else {
			System.out.println("Отрезки не пересекаются!");
		}
	}
}
