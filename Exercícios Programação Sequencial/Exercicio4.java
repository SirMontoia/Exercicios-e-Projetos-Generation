/*4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o:*/

package Turma29;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double A, B, C, equacao;
		
		System.out.println(" Entre com o n�mero A: ");
		A= leia.nextDouble();
		System.out.println(" Entre com o n�mero B: ");
		B= leia.nextDouble();
		System.out.println(" Entre com o n�mero C: ");
		C= leia.nextDouble();
		
		equacao = (Math.pow(A+B, 2) + Math.pow(B+C, 2)) / 2;
 		
		System.out.println(" O resultado da equa��o �" + equacao);
		
		
		
		
		

	}

}
