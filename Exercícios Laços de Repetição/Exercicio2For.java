//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

package Turma29;

import java.util.Scanner;

public class Exercicio2For {
	
		public static void main (String[] args) {
			
			Scanner leia = new Scanner (System.in);
			
			int x, numero , quantpar=0, quantiimpar=0;
			
			for (x=1 ; x<=10 ; x++) {
				
				System.out.println("Entre com um valor");
				numero= leia.nextInt();
				
				if(numero % 2==0) 
				{
					quantpar++;
				}
				else 
				{
					quantiimpar++;
				}
			} 
				System.out.println("A quantidade de n�meros pares �" +quantpar+"e de �mpares �" +quantiimpar);
			
		}
		

}
