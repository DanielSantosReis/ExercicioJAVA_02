package br.com.generation.lacosCondicionais;

import java.util.Scanner;

public class exercicio04 {
	/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
	*/

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double raiz = 0.0, quadrado = 0.0;  // Declaração de variáveis
		int number;
											// Nome do Programa
		System.out.println("Par ou Ímpar"); 
		System.out.println("\nInsira um número desejado: ");  //Local do Usuário digitar
		number = entrada.nextInt();
		
		if (number%2 == 0) {				// Laço de Decisão 
			
			raiz = Math.sqrt(number);
			
			System.out.println("O número "+ number + " é Par!!!");
			System.out.println("\nA raiz quadrada do número: " + raiz);
		}else {
			
			quadrado = Math.pow((number),2);
			
			System.out.println("O número "+ number +" é Ímpar!!!");
			System.out.println("\nA raiz quadrada do número: " +quadrado);
		}
		
		entrada.close();
	}
}
