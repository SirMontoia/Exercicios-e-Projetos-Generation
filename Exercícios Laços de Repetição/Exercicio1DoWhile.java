/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

package Turma29;

import java.util.Scanner;

public class Exercicio1DoWhile {

	public static void main(String[] args) {
		
		Scanner leia =  new Scanner (System.in);
		
		int numero, somanumeros=0;
		
		System.out.println("\n Entre com um n�mero :");
		numero = leia.nextInt();
		
		do 
		{
			somanumeros += numero;
			System.out.println("\n Entre com um n�mero :"); 
			numero = leia.nextInt();
		}
		while (numero!=0);
		
		System.out.println("\n A soma dos valores digitados � " + somanumeros);
	}
	

}
