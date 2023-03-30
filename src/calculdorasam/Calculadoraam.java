package calculdorasam;

import java.util.Scanner;

/*
 * Calculadora
 * 
 * Versão: 1.0.1
 * 
 * Autor: Samuel Nojoza
 * 
 * Data: 28/03/2023
 * 
 */
public class Calculadoraam {

	public static void main(String[] args) {

		int num1;
		int num2;
		
		//Entrada
		
		Scanner input = new Scanner(System.in);
		System.out.println("Qual o primeiro número?");	
		num1 = input.nextInt();
		System.out.println("Qual o segundo número?");	
		num2 = input.nextInt();
		
		
		
				
		System.out.println("A soma desses números é :"+(num1 + num2));
		System.out.println("A subtração desses números é :"+(num1 - num2));
		System.out.println("A multiplicação desses números é :"+(num1 * num2));
		System.out.println("A divisão desses números é :"+(num1 / num2));
		
	}

}
