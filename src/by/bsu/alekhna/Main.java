package by.bsu.alekhna;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static int[] mass(int size) {
		System.out.print("ЗАДАНИЕ 1\n");
		int[] mass = new int[size];
		for (int i = 0; i < mass.length; i++) {
			// mass[i] =
			mass[i] = (int) (Math.random() * size)+1;
			System.out.print(mass[i] + " ");
		}
		return mass;
	}

	public static int[] massCh(int mass[]) {
		System.out.print("\n\nЗАДАНИЕ 2\n");
		System.out.println("чётные");
		int[] massCh = new int[mass.length];

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 == 0) {
				massCh[i] = mass[i];
				System.out.print(mass[i] + " ");
			}
		}
		return massCh;
	}

	public static int[] massNech(int mass[]) {
		System.out.print("\nнечетные\n");
		int[] massNech = new int[mass.length];
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 != 0) {
				massNech[i] = mass[i];
				System.out.print(mass[i] + " ");
			}
		}
		return massNech;
	}

	public static int raznNech(int mass[]) {

		System.out.println("\n\nЗАДАНИЕ 3");
		int raznost = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 != 0) {
				raznost = raznost - mass[i];
			}
		}
		return raznost;
	}

	public static void kolvoChetnNechetn(int[] mass) {
		int chetn = 0;
		int nechetn = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 == 0) {
				chetn++;
			} else if (mass[i] % 2 != 0) {
				nechetn++;
			}
		}
		System.out.println("кол-во четных " + chetn + "\nкол-во нечетных " + nechetn);
	}

	public static void maxMin(int[] mass) {
		int max = 0;
		int min = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > max) {
				max = mass[i];
			} else if (mass[i] < min) {
				min = mass[i];
			}
		}
		System.out.println("максимальный элемент-> " + max + " минимальный элемент-> " + min);
	}

	public static void maxChetn(int[] massCh, int[] massNech) {
		// можно сделать 4 интовских метода, что бы можно было присваивать
		// значения переменным, но в задании указано просто найти, как
		// правильно?
		System.out.print("\nЗАДАНИЕ 6\n");
		int maxNech = 0;
		int minNech = 0;
		for (int i = 0; i < massNech.length; i++) {
			if (massNech[i] > maxNech) {
				maxNech = massNech[i];
			} else if (massNech[i] < minNech) {
				minNech = massNech[i];
			}
		}
		int maxCh = 0;
		int minCh = 0;
		for (int i = 0; i < massCh.length; i++) {
			if (massCh[i] > maxCh) {
				maxCh = massCh[i];
			} else if (massCh[i] < minCh) {
				minNech = massCh[i];
			}
		}
		System.out.println(
				"максимальный элемент из нечетных-> " + maxNech + " минимальный элемент из нечетных-> " + minNech);
		System.out.println("максимальный элемент из четных-> " + maxCh + " минимальный элемент из четных-> " + minCh);
	}

	public static char[] fio7() {
		char[] fio7 = { 'А', 'л', 'е', 'х', 'н', 'а', ' ', 'Д', 'м', 'и', 'т', 'р', 'и', 'й' };
		return fio7;
	}

	public static char[] fio7_1(char[] fio7) {
		System.out.print("\nЗАДАНИЕ 7.1\n");
		String string = new String();
		Scanner sc = new Scanner(System.in);
		char[] fio7_1 = new char[fio7.length];
		string = sc.nextLine();
		for (int i = 0; i < fio7_1.length; i++) {
			fio7_1[i] = string.charAt(i);
			System.out.print(fio7_1[i]);
		}
		return fio7_1;
	}

	public static char[] fio8() {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		char[] fio8 = new char[fio7().length + string.length() + 100];
		fio8 = fio7();
		for (int i = fio7().length; i < fio8.length; i++) {
			fio8[i] = string.charAt(i);
			System.out.print(fio8[i]);
		}
		return fio8;
	}

	public static void main(String[] args) {
	
		mass(20);
	}
}

// 8. Добавить в массив из задания 7 пробел и отчество
// 9. Удалить из массива (1е задание) все элементы, кратные 3
// 9.1 Привести размер массива из задания 9 в соответствие с реальным
// количеством хранимых элементов
// 10. Отсортировать массив по возрастанию / убыванию следующими способами (в
// классе выбрать 2 любых способа):
// пузырьком, вставками, выбором, Быстрая сортировка
