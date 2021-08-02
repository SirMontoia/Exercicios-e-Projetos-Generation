/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:*/

package Turma29;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double A, B, C, equacao;
		
		System.out.println(" Entre com o número A: ");
		A= leia.nextDouble();
		System.out.println(" Entre com o número B: ");
		B= leia.nextDouble();
		System.out.println(" Entre com o número C: ");
		C= leia.nextDouble();
		
		equacao = (Math.pow(A+B, 2) + Math.pow(B+C, 2)) / 2;
 		
		System.out.println(" O resultado da equação é" + equacao);
		
		
		
		
		

	}

}
