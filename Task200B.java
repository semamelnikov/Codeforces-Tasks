/*
Маленький мальчик Вася очень любит апельсиновый сок, и поэтому в любом продукте и напитке у него на кухне обязательно содержится апельсиновый сок. В его холодильнике хранятся n напитков, объемная доля апельсинового сока в i-ом напитке составляет pi процентов.

Однажды Вася решил приготовить себе апельсиновый коктейль, и для этого он взял в равных пропорциях каждого из n напитков и смешал. После этого ему стало интересно, как много апельсинового сока содержится в его коктейле.

Найдите объемную долю апельсинового сока в получившемся напитке.

Входные данные
В первой строке входного файла содержится единственное целое число n (1 ≤ n ≤ 100) — количество апельсиновых напитков в холодильнике у Васи. Во второй строке находятся n целых чисел pi (0 ≤ pi ≤ 100) — объемная доля в процентах апельсинового сока в i-ом напитке. Числа разделены пробелом.

Выходные данные
Выведите объемную долю в процентах апельсинового сока в коктейле Васи. Ответ будет считаться верным, если его абсолютная или относительная погрешность не превышает 10  - 4.

Примеры
входные данные
3
50 50 100
выходные данные
66.666666666667
входные данные
4
0 25 50 75
выходные данные
37.500000000000
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Task200B {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			double num = sc.nextInt();
			sum += num / 100;
		}
		double ans = (sum / n) * 100;
		String pattern = "##0.0000000000";
		DecimalFormat df = new DecimalFormat(pattern);
		String answer = df.format(ans);
		System.out.println(answer);
	}
}