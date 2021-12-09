package br.com.generation.lacosCondicionais;

import java.util.Scanner;

public class exercicio03 {
	/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
		 10-14 infantil
		 15-17 juvenil
		 18-25 adulto
	*/
	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		int idade;	// Declaração de variáveis
		
		System.out.println("Controle de acesso");	// Nome do Programa
		System.out.println("\nInsira a idade do Cliente: ");  // Local do Usuário
		idade = entrada.nextInt();
		
		if (idade >= 10 && idade <=14) {			// Laço de Decisão
			
			System.out.println("\nEsta pessoa está na categoria Infantil.");
		}else if (idade >= 15 && idade <= 17) {
			
			System.out.println("\nEsta pessoa está na categoria Juvenil.");
		}else if (idade >= 18 && idade <= 25) {
			
			System.out.println("\nEsta pessoa está na categoria Adulto. ");
		}else {
			
			System.out.println("\nNão há categoria para esta idade.");
		}
		
		entrada.close();
	}
}
