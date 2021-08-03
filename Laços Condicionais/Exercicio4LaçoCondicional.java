/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package Turma29;

import java.util.Scanner;

public class Exercicio4LaçoCondicional {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numero, raiz , potencia = 0;
		
		System.out.println(" Digite um número :");
		numero= leia.nextDouble();
		
		if (numero % 2 ==0) {
			
			raiz = Math.sqrt(numero);
			System.out.println(" O número é par e sua raiz é " + raiz);
			
		}
		else {
			potencia = Math.pow(numero, 2);
			System.out.println(" O número é ímpar e seu quadrado é " + potencia);
		}
				
	}
	

}
