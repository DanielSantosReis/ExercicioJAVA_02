package br.com.generation.lacosCondicionais;

import java.util.Scanner;

public class exercicio02 {
	//02. Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;    					 //Declara��o de vari�veis
		
		System.out.println("Digite tr�s n�meros: "); //Local do Usu�rio entrar com valores
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		
		if (num1 <= num2 && num2 <= num3) {		//Inicio do la�o de condi��o || H� 6 poss�veis c�lculos
			
			System.out.println("A 1� ordem crescente foi utilizada: " + num1 +","+ num2 +","+ num3);
		} else if (num1 <= num3 && num3 <= num2) {
			
			System.out.println("A 2� ordem crescente foi utilizada: " + num1 +","+ num3 +","+ num2);
		} else if (num2 <= num1 && num1 <= num3) { 
			
			System.out.println("A 3� ordem crescente foi utilizada: " + num2 +","+ num1 +","+ num3);
		} else if (num2 <= num3 && num3 <= num1) {
			
			System.out.println("A 4� ordem crescente foi utilizada: " + num2 +","+ num3 +","+ num1);
		} else if (num3 <= num2 && num2 <= num1) {
			
			System.out.println("A 5� ordem crescente foi utilizada: " + num3 +","+ num2 +","+ num1);
		}else {
			
			System.out.println("A 6� ordem crescente foi utilizada: " + num3 +","+ num1 +","+ num2);
		}
	entrada.close();
		
	}

}
