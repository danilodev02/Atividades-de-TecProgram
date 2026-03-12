package br.edu.fatec.tecprog.view;
import java.util.Scanner;
public class B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = 0, x;
		System.out.println("Digite idade de 10 pessoas: ");
		for (int i = 0; i < 10; i++) {
			x = scan.nextInt();
			if (x >= 18) {
				a++;
			}
		}
		
		System.out.println("Total de pessoas com 18 anos ou mais: " + a);
	}

}
