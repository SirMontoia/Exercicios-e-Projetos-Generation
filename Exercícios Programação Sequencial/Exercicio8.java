/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

package Turma29;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double custoFabrica, custoConsumidor;
		
		System.out.println("Entre com o custo de Fábrica: ");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = custoFabrica * 0.73;
		
		System.out.printf(" O custo ao consumidor é de %2.2f" , custoConsumidor);
		
	}

}
