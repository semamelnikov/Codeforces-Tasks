/*
В наши дни очень много парней ставят себе фотографии красивых девушек на аватарки на форумах. Из-за этого очень часто сложно определить пол пользователя на форуме. В прошлом году наш герой пообщался в чате на форуме с одной красоткой (как он думал). После этого наш герой и предполагаемая красотка стали общаться еще чаще и в конце концов стали парой в сети.

Но вчера наш герой захотел увидеть свою красотку в реальной жизни и, каково же было его удивление, когда красоткой оказался здоровенный мужчина! Наш герой очень расстроился и теперь он, наверное, никогда больше не сможет полюбить. Сейчас к нему пришла в голову идея, как по имени пользователя определить его пол.

Вот его метод: если количество различных символов в имени пользователя нечетное, тогда пользователь мужского пола, иначе — женского. Вам дана строка, обозначающая имя пользователя, помогите нашему герою определить по ней пол пользователя по описанному методу.

Входные данные
В первой строке записана непустая строка, состоящая только из строчных букв латинского алфавита — имя пользователя. Эта строка состоит из не более чем 100 букв.

Выходные данные
Если пользователь оказался женского пола по методу нашего героя, выведите «CHAT WITH HER!» (без кавычек), иначе, выведите «IGNORE HIM!» (без кавычек).

Примеры
входные данные
wjmzbmr
выходные данные
CHAT WITH HER!
входные данные
xiaodao
выходные данные
IGNORE HIM!
входные данные
sevenkplus
выходные данные
CHAT WITH HER!
Примечание
Рассмотрим первый тестовый пример. В этом примере в имени пользователя «wjmzbmr» 6 различных символов. Это символы: «w», «j», «m», «z», «b», «r». Таким образом по методу нашего героя «wjmzbmr» женского пола, то есть надо вывести «CHAT WITH HER!».
*/

import java.util.Scanner;

public class Task236A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		char[] name = userName.toCharArray();
		int counter = 0;
		for (int i = 0; i < name.length; i++) {
			if (name[i] != '_') {
				counter++;
				for (int j = i+1; j < name.length; j++) {
					if (name[j] == name[i]) {
						name[j] = '_';
					}
				}
			}
		}
		if (counter % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}
	}
}
