/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

package Turma29;

import java.util.Scanner;

public class Exercicio1Vetor {
		
		public static void main (String[] args) {
			
			Scanner leia = new Scanner (System.in);
			
			int [] vetorA = new int [6];
			int soma=0, x;
			
			for ( x=0 ; x<6 ; x++) { //a)
				
				vetorA [0] = 1;
				vetorA [1] = 0;
				vetorA [2] = 5;
				vetorA [3] = -2;
				vetorA [4] = -5;
				vetorA [5] = 7;
				
				soma = vetorA[0] + vetorA[1] + vetorA [5]; //b)
			}
			System.out.println("A soma das posições 1, 2 e 6 é :" + soma);
			
			for(x =0 ; x<6 ; x++) {
				
				vetorA[4] = 100; //c)
				
				
				System.out.println(vetorA[x]);
			}
			
			
			
		}
}
