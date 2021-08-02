
/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

package Turma29;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int idadeEmDias, idadeEmMeses, idadeEmAnos;
		
		System.out.println("\n Entre com sua idade :");
		idadeEmDias = leia.nextInt(); 
		
		idadeEmAnos = idadeEmDias / 365;
		
		idadeEmMeses = (idadeEmDias % 365) / 30;
		
		idadeEmDias = (idadeEmDias % 365) % 30;
		
		System.out.println(" Sua idade em dias é " + idadeEmDias);
		System.out.println(" Sua idade em meses é " + idadeEmMeses);
		System.out.println(" Sua idade em anos é " + idadeEmAnos);
		
		

	}

}
