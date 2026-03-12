package br.edu.fatec.tecprog.view;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[10];
		int i = 0, a = 0, b = 0;
		
		System.out.println("Digite 10 numeros: ");
		
		do {
			numbers[i] = scan.nextInt();
			i++;
		} while (i < 10);
		
		for(i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			if (x % 2 == 0) {
				a++;
			} else {
				b++;
			}
		}
		
		System.out.println("Quantidade de numeros pares: " + a
				   + "\nQuantidade de numeros impares: " + b);
	}
}
