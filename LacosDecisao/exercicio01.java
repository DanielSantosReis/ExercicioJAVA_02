package br.com.generation.lacosCondicionais;

import java.util.Scanner;
public class exercicio01 {
	//Faça um programa que receba três inteiros e diga qual deles é o maior.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;                        // Declaração de Variáveis
		
		System.out.println("Insira três numeros: "); // Local de acesso do Usuário
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {  		 // Laço de Decisão
			
			System.out.println("O número um é o maior: " + num1);
		}else if (num2 >= num1 && num2 >= num3) {
			
			System.out.println("O número dois é o maior: "+num2);
		}else if (num3 >= num1 && num3 >= num2) {
			
			System.out.println("O número três é o maior: "+num3);
		}
	entrada.close();	
	
	}

}
