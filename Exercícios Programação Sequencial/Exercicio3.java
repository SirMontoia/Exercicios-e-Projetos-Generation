/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package Turma29;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int segundosInformados, horas, minutos, segundos;
		
		System.out.println("Entre com o tempo do evento: ");
		segundosInformados = leia.nextInt();
		
		horas = segundosInformados / 3600;
		
		minutos = (segundosInformados % 3600) / 60;
		
		segundos = (segundosInformados % 3600) % 60;
	
		System.out.println("O tempo do evento em horas �: " + horas);
		System.out.println("O tempo do evento em minutos �: " + minutos);
		System.out.println("O tempo do evento em segundos �: " + segundos);
		

	}

}
