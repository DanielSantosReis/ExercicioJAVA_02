package br.com.generation.lacosCondicionais;

import java.util.Scanner;

public class exercicio02 {
	//02. Faça um programa que entre com três números e coloque em ordem crescente.

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;    					 //Declaração de variáveis
		
		System.out.println("Digite três números: "); //Local do Usuário entrar com valores
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		
		if (num1 <= num2 && num2 <= num3) {		//Inicio do laço de condição || Há 6 possíveis cálculos
			
			System.out.println("A 1º ordem crescente foi utilizada: " + num1 +","+ num2 +","+ num3);
		} else if (num1 <= num3 && num3 <= num2) {
			
			System.out.println("A 2º ordem crescente foi utilizada: " + num1 +","+ num3 +","+ num2);
		} else if (num2 <= num1 && num1 <= num3) { 
			
			System.out.println("A 3º ordem crescente foi utilizada: " + num2 +","+ num1 +","+ num3);
		} else if (num2 <= num3 && num3 <= num1) {
			
			System.out.println("A 4º ordem crescente foi utilizada: " + num2 +","+ num3 +","+ num1);
		} else if (num3 <= num2 && num2 <= num1) {
			
			System.out.println("A 5º ordem crescente foi utilizada: " + num3 +","+ num2 +","+ num1);
		}else {
			
			System.out.println("A 6º ordem crescente foi utilizada: " + num3 +","+ num1 +","+ num2);
		}
	entrada.close();
		
	}

}
