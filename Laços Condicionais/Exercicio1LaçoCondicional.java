
//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package Turma29;

import java.util.Scanner;

public class Exercicio1La�oCondicional {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println(" Entre com o n�mero 1: ");
		numero1 = leia.nextInt();
		System.out.println(" Entre com o n�mero 2: ");
		numero2 = leia.nextInt();
		System.out.println(" Entre com o n�mero 3: ");
		numero3 = leia.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3 ) {
			
			System.out.println("\n O maior n�mero � " + numero1);
			
		}
		else if (numero2>numero1 && numero2>numero3) {
			
			System.out.println(" O maior n�mero � " + numero2);
					}
		
		else {
			System.out.println(" O maior n�mero � " + numero3);
		}
		
				
	}

}
