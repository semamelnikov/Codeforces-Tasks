/*
Dreamoon хочет подняться по лестнице, состоящей из n ступенек. За один шаг он может преодолеть 1 или 2 ступеньки. При этом, Dreamoon хочет, чтобы количество шагов было кратно целому числу m.

Какое минимальное количество шагов ему придётся сделать, чтобы подняться, выполнив своё условие?

Входные данные
В единственной строке записано два целых числа через пробел — n, m (0 < n ≤ 10000, 1 < m ≤ 10).

Выходные данные
Выведите единственное число — минимальное количество шагов, кратное m. Если способа взобраться по лестнице, выполнив условие задачи, не существует, выведите  - 1.

Примеры
входные данные
10 2
выходные данные
6
входные данные
3 5
выходные данные
-1
Примечание
В первом примере Dreamoon может взойти по лестнице за 6 ходов, совершая следующие шаги: {2, 2, 2, 2, 1, 1}.

Во втором примере есть только три подходящих последовательностей шагов {2, 1}, {1, 2}, {1, 1, 1} длины 2, 2, и 3 соответственно. Все эти числа не кратны 5.
*/

import java.util.Scanner;

public class Task476A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = -1;
		int div = (n+1) / 2;
		while (div <= n) {
			if (div % m == 0) {
				sum = div;
				break;
			}
			div++;
		}
		System.out.println(sum);
	}
}