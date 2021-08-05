//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.



package Turma29;

import java.util.Scanner;

public class Exercicio1Matriz {
	
		public static void main (String[] args) {
			
			Scanner leia =  new Scanner (System.in);
			
			int matriz [][] =  new int [3][3];
			int contador10 =0;
			
			for(int linha=0 ; linha<3 ; linha++) 
			{
				
				for(int coluna = 0 ; coluna<3 ; coluna++) 
				{
					System.out.println("Entre com um valor: ");
					matriz[linha][coluna] = leia.nextInt();
					
					if (matriz[linha][coluna] > 10) {
						contador10++;
					}
					
				}
			}	
				System.out.println ("O número de valores acima de dez é: "+ contador10);
			
			}

}
