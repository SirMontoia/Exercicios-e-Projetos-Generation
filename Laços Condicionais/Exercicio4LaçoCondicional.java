/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

package Turma29;

import java.util.Scanner;

public class Exercicio4La�oCondicional {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numero, raiz , potencia = 0;
		
		System.out.println(" Digite um n�mero :");
		numero= leia.nextDouble();
		
		if (numero % 2 ==0) {
			
			raiz = Math.sqrt(numero);
			System.out.println(" O n�mero � par e sua raiz � " + raiz);
			
		}
		else {
			potencia = Math.pow(numero, 2);
			System.out.println(" O n�mero � �mpar e seu quadrado � " + potencia);
		}
				
	}
	

}
