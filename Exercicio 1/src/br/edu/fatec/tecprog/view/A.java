package br.edu.fatec.tecprog.view;
import java.util.Scanner;
public class A {
	
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o primeiro numero: ");
	        double first_number = sc.nextDouble();

	        System.out.println("1. Somar");
	        System.out.println("2. Subtrair");
	        System.out.println("3. Multiplicar");
	        System.out.println("4. Dividir");
	        System.out.println("5. Raiz Quadrada");

	        System.out.print("Digite a operação desejada: ");
	        int sinal = sc.nextInt();

	        double second_number = 0;

	        if (sinal != 5) {
	            System.out.print("Digite o segundo numero: ");
	            second_number = sc.nextDouble();
	        }

	        switch (sinal) {

	            case 1:
	                System.out.println(first_number + " + " + second_number + " = " + (first_number + second_number));
	                break;

	            case 2:
	                System.out.println(first_number + " - " + second_number + " = " + (first_number - second_number));
	                break;

	            case 3:
	                System.out.println(first_number + " * " + second_number + " = " + (first_number * second_number));
	                break;

	            case 4:
	                if (second_number == 0) {
	                    System.out.println("Erro: Divisão por zero");
	                } else {
	                    System.out.println(first_number + " / " + second_number + " = " + (first_number / second_number));
	                }
	                break;

	            case 5:
	                if (first_number < 0) {
	                    System.out.println("Erro: não existe raiz quadrada real de número negativo");
	                } else {
	                    System.out.println("√" + first_number + " = " + Math.sqrt(first_number));
	                }
	                break;

	            default:
	                System.out.println("Não existe essa opção");
	                break;
	        }

	        for (int a = 1; a <= 10; a++) {
	            System.out.println("\nTabuada do " + a);
	            for (int b = 1; b <= 10; b++) {
	                System.out.println(a + " * " + b + " = " + (a * b));
	            }
	        }

	        sc.close();
	}
}
