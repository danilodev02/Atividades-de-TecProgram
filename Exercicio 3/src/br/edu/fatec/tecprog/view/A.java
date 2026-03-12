package br.edu.fatec.tecprog.view;
import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[10];
		int i = 0;
		
		System.out.println("Digite 10 numeros: ");
		
		do {
			numbers[i] = scan.nextInt();
			i++;
		} while (i < 10);
		
		for (i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			if (x % 2 == 0) {
				System.out.print("Par: " + x + " ");
				x += 1;
				System.out.print("Virou: " + x + "\n");
			} else {
				System.out.print("Impar: " + x + " ");
				x -= 1;
				System.out.print("Virou: " + x + "\n");
			}
		}
	}
}
