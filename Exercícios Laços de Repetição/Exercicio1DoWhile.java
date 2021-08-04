/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

package Turma29;

import java.util.Scanner;

public class Exercicio1DoWhile {

	public static void main(String[] args) {
		
		Scanner leia =  new Scanner (System.in);
		
		int numero, somanumeros=0;
		
		System.out.println("\n Entre com um número :");
		numero = leia.nextInt();
		
		do 
		{
			somanumeros += numero;
			System.out.println("\n Entre com um número :"); 
			numero = leia.nextInt();
		}
		while (numero!=0);
		
		System.out.println("\n A soma dos valores digitados é " + somanumeros);
	}
	

}
