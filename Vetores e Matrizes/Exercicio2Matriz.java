/*4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
*/

package Turma29;

import java.util.Scanner;

public class Exercicio2Matriz {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float matriz[][] =  new float [2][2];
		float matriz2[][]= new float [2][2];
		float matriz3[][] = new float [2][2];
		int escolha, linha, coluna=0;
		final double adicao =3 ;
		
		for (linha=0 ; linha<2 ; linha++) {
			for(coluna = 0 ; coluna<2 ; coluna++) {
				
				System.out.println("\n Digite um valor para a matriz 1");
				matriz[linha][coluna] = leia.nextInt();
				
			}
		}
		
		for (linha=0 ; linha<2 ; linha++) {
			for(coluna = 0 ; coluna<2 ; coluna++) {
				
				System.out.println("\n Digite um valor para a matriz 2");
				matriz2[linha][coluna] = leia.nextInt();
				
			}
		}
		
		System.out.println("\n Escolha uma das op��es abaixos");
		System.out.println("\n 1 para somar as matrizes");
		System.out.println("\n 2 para subtrair a primeira matriz da segunda");
		System.out.println("\n 3 para adicionar uma constante as duas matrizes");
		System.out.println("\n 4 para imprimir as duas matrizes");
		escolha = leia.nextInt();
		
		
		
		for (linha = 0 ; linha<2 ; linha++) {
			for(coluna = 0 ; coluna<2 ; coluna++) {
				switch (escolha) {
				
				case (1):
					
				matriz3 [linha][coluna] = matriz[linha][coluna] + matriz2[linha][coluna];
				System.out.printf("[%2.1f] " , matriz3[linha][coluna]);
				
				
				break;
				
				case (2):
					
				matriz3 [linha][coluna] = matriz[linha][coluna] - matriz2[linha][coluna];
				System.out.printf("[%2.1f]" , matriz3[linha][coluna]);
				
				break;
				
				
				case(3):
					
				matriz[linha][coluna] += adicao;
				matriz2[linha][coluna] += adicao;
				
				System.out.printf("[%2.1f] |" , matriz[linha][coluna]);
				System.out.printf("[%2.1f] |" , matriz2[linha][coluna]);
				
				break;
				
				
				case (4):
					
				System.out.printf(" [%2.1f] |", matriz[linha][coluna]);
				System.out.printf(" [%2.1f] |", matriz2[linha][coluna]);
				break;
				
				}
			} System.out.println();
		}
		
	}

}
