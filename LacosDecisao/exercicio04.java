package br.com.generation.lacosCondicionais;

import java.util.Scanner;

public class exercicio04 {
	/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
	*/

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double raiz = 0.0, quadrado = 0.0;  // Declara��o de vari�veis
		int number;
											// Nome do Programa
		System.out.println("Par ou �mpar"); 
		System.out.println("\nInsira um n�mero desejado: ");  //Local do Usu�rio digitar
		number = entrada.nextInt();
		
		if (number%2 == 0) {				// La�o de Decis�o 
			
			raiz = Math.sqrt(number);
			
			System.out.println("O n�mero "+ number + " � Par!!!");
			System.out.println("\nA raiz quadrada do n�mero: " + raiz);
		}else {
			
			quadrado = Math.pow((number),2);
			
			System.out.println("O n�mero "+ number +" � �mpar!!!");
			System.out.println("\nA raiz quadrada do n�mero: " +quadrado);
		}
		
		entrada.close();
	}
}
