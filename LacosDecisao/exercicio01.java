package br.com.generation.lacosCondicionais;

import java.util.Scanner;
public class exercicio01 {
	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;                        // Declara��o de Vari�veis
		
		System.out.println("Insira tr�s numeros: "); // Local de acesso do Usu�rio
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {  		 // La�o de Decis�o
			
			System.out.println("O n�mero um � o maior: " + num1);
		}else if (num2 >= num1 && num2 >= num3) {
			
			System.out.println("O n�mero dois � o maior: "+num2);
		}else if (num3 >= num1 && num3 >= num2) {
			
			System.out.println("O n�mero tr�s � o maior: "+num3);
		}
	entrada.close();	
	
	}

}
