/*
Семен и Антисемен играют в игру. Изначально каждому игроку дано одно фиксированное целое положительное число, которое не меняется в процессе игры. Семену дано число a, Антисемену дано число b. Также у них есть кучка из n камней. Игроки ходят по очереди, первый ход делает Семен. На своем ходу игрок должен взять из кучки число камней, равное наибольшему общему делителю данного ему числа и количества оставшихся камней в кучке. Проигрывает тот, кто не сможет взять требуемое число камней (по причине того, что в кучке остается строго меньше камней, чем нужно взять).

Ваша задача — по заданным a, b и n определить, кто выиграет в этой игре.

Входные данные
В единственной строке через пробел записаны целые числа a, b и n (1 ≤ a, b, n ≤ 100) — числа, данные Семену и Антисемену соответственно, и исходное количество камней в кучке.

Выходные данные
Если выиграет Семен, выведите «0» (без кавычек), иначе выведите «1» (без кавычек).

Примеры
входные данные
3 5 9
выходные данные
0
входные данные
1 1 100
выходные данные
1
*/

import java.util.Scanner;

public class Task119A {
	
	public static int gCD (int x, int y) {
		int result;
		if (x != 0) {
			result = gCD (y % x, x);
		} else {
			result = y;
		}
		return result;
	}	
	
	public static char name (int x) {
		char a;
		if (x % 2 == 0) {
			a = '0';
		} else {
			a = '1';
		}
		return a;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int i = 0;
		while (n >= 0) {
			if (i % 2 == 0) {
				n -= gCD(a,n);
			} else {
				n -= gCD(b,n);
			}
			if (n < 0) {
				System.out.println(name(i+1));
			} else {
				i++;
			}
		}
	}
}