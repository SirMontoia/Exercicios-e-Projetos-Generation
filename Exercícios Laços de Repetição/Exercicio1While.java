/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

package Turma29;

import java.util.Scanner;

public class Exercicio1While {
		
		public static void main (String [] args) {
			
			Scanner leia = new Scanner (System.in);
			
			int idade=0, total21=0, total50=0;
			
			System.out.println("\n Entre com uma idade:");
			idade= leia.nextInt();
			
			while (idade !=-99) {
				
				if(idade<21) {
					
					total21++;
				}
				else if(idade>50) {
					
					total50++;
				}
				else {
					System.out.println("\n idade informada fora do escopo de análise!");
				}
				System.out.println("\nEntre com uma idade:");
				idade= leia.nextInt();
			} 
			System.out.println("\n O total de pessoas com menos de 21 anos é " + total21);
			System.out.println("\n O total de pessoas com mais de 50 anos é " + total50);
			
		}

}
