/*
Скрудж МакДак держит свои самые сокровенные сбережения в сейфе, защищенном кодовым замком. Каждый раз, когда он кладет туда новые честно заработанные драгоценности, он вынужден открывать замок.

Кодовый замок представляет собой n вращающихся дисков с написанными на них цифрами от 0 до 9. Скрудж МакДак должен повернуть некоторые из дисков так, чтобы последовательность цифр на дисках образовала секретную комбинацию. За одно действие он может прокрутить один из дисков на одну цифру вперед или назад. В частности, за одно действие можно перейти от цифры 0 к цифре 9 и наоборот. Какое минимальное количество действий ему для этого потребуется?

Входные данные
В первой строке записано единственное целое число n (1 ≤ n ≤ 1000) — количество дисков на кодовом замке.

Во второй строке записана строка из n цифр — исходное положение дисков.

В третьей строке записана строка из n цифр — комбинация Скруджа МакДака, открывающая замок.

Выходные данные
Выведите единственное целое число — минимальное количество действий, за которое Скрудж МакДак откроет замок.

Примеры
входные данные
5
82195
64723
выходные данные
13
*/

import java.util.Scanner;

public class Task540A {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char[] comb = str1.toCharArray();
		char[] key = str2.toCharArray();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int currKey = Character.getNumericValue(key[i]);
			int currComb = Character.getNumericValue(comb[i]);
			int step1 = Math.abs(currKey - currComb);
			int step2 = 10 - Math.abs(currKey - currComb);
			sum += Math.min(step1, step2);
		}
		System.out.println(sum);
	}
}