/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/


package Turma29;

import java.util.Scanner;

public class Exercicio2DoWhile {
	
		public static void main (String[] args) {
			
			Scanner leia = new Scanner (System.in);
			
			int numero, somaNum3=0, contNum3=0;
			double mediaNum3;
			
			do {
				System.out.println("Entre com um valor ");
				numero = leia.nextInt();
				
				if(numero % 3==0) 
				{
					contNum3++;
					somaNum3 += numero;
					
				}
				
				
			}
			while (numero !=0);
			
			mediaNum3 = somaNum3 / contNum3;
			System.out.printf("A m�dia dos n�meros m�ltiplos de 3 digitados �  %2.2f" , mediaNum3);
			
		}

}
