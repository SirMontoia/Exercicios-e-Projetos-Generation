/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/

package Turma29;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double nota1, nota2, nota3, mediaFinal;
		
		System.out.println("\nEntre com a primeira nota :");
		nota1 = leia.nextDouble();
		System.out.println("\nEntre com a segunda nota :");
		nota2 = leia.nextDouble();
		System.out.println("\nEntre com a terceira nota :");
		nota3 = leia.nextDouble();
		
		mediaFinal = ((nota1*2) + (nota2*3) +(nota3*5)) / 10;
		
		System.out.printf("\nSua m�dia ponderada � : %2.2f", mediaFinal);
		
	}

}
