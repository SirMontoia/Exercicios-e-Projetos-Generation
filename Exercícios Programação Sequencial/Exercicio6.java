/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula*/

package Turma29;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double x1, x2, y1, y2, formulaDistancia;
		
		System.out.println("\nEntre com o ponto x1:");
		x1 = leia.nextDouble();
		System.out.println("Entre com o ponto x2 :");
		x2 = leia.nextDouble();
		System.out.println("Entre com o ponto y1 :");
		y1 = leia.nextDouble();
		System.out.println("Entre com o ponto y2 :");
		y2 = leia.nextDouble();
		
		formulaDistancia = Math.sqrt(Math.pow(x2-x2, 2) + Math.pow(y2-y1, 2));
		
		System.out.printf("\n A distância entre os dois pontos é: 2.2f", formulaDistancia);
		
		
		}

}
