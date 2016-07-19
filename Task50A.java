/*
Дана прямоугольная клеточная доска размера M × N клеток. Также дано неограниченное количество стандартных доминошек размера 2 × 1 клетку. Доминошки можно поворачивать. Требуется уложить как можно больше доминошек на доску так, чтобы соблюдались следующие условия:

1. Каждая доминошка полностью покрывает две клетки доски.

2. Никакие две доминошки не перекрываются.

3. Каждая доминошка полностью лежит внутри доски. Касание краев доски допускается.

Найдите максимальное количество доминошек, которое можно уложить с данными ограничениями.

Входные данные
В единственной строке записано два целых числа M и N — размеры доски в клетках (1 ≤ M ≤ N ≤ 16).

Выходные данные
Выведите одно число — максимальное количество доминошек, которое можно уложить.

Примеры
входные данные
2 4
выходные данные
4
входные данные
3 3
выходные данные
4

*/

import java.util.Scanner;

public class Task50A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long m = sc.nextInt();
		long n = sc.nextInt();
		System.out.println((m*n)/2);
	}
}
