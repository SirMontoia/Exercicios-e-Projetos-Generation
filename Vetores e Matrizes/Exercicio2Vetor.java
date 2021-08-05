/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/


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
				System.out.println(vetor[x] + " <----- Esse número é par");
			}
			else {
				contimpar++;
				System.out.println(vetor[x] + " <----- Esse número é ímpar");
			}
		}
		
		System.out.println("\n A soma dos números pares digitados é: " + somaPar);
		System.out.println("\n A quantidade de número ímpares é: " + contimpar);
		
		
	}

}
