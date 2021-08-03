
//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

package Turma29;

import java.util.Scanner;

public class Exercicio1LaçoCondicional {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println(" Entre com o número 1: ");
		numero1 = leia.nextInt();
		System.out.println(" Entre com o número 2: ");
		numero2 = leia.nextInt();
		System.out.println(" Entre com o número 3: ");
		numero3 = leia.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3 ) {
			
			System.out.println("\n O maior número é " + numero1);
			
		}
		else if (numero2>numero1 && numero2>numero3) {
			
			System.out.println(" O maior número é " + numero2);
					}
		
		else {
			System.out.println(" O maior número é " + numero3);
		}
		
				
	}

}
