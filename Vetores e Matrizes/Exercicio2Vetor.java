/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/


package Turma29;

import java.util.Scanner;

public class Exercicio2Vetor {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int vetor[] = new int[6];
		int x, somaPar=0, contimpar=0;
		
		for (x=0 ; x<6 ; x++) {
			
			System.out.println("\nEntre com um valor: ");
			vetor[x] = leia.nextInt();
			
			if(vetor[x] % 2 ==0){
				
				somaPar += vetor[x];
				System.out.println(vetor[x] + " <----- Esse n�mero � par");
			}
			else {
				contimpar++;
				System.out.println(vetor[x] + " <----- Esse n�mero � �mpar");
			}
		}
		
		System.out.println("\n A soma dos n�meros pares digitados �: " + somaPar);
		System.out.println("\n A quantidade de n�mero �mpares �: " + contimpar);
		
		
	}

}
