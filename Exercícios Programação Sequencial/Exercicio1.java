
/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

package Turma29;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String[] args) {
		
		
		int  anos, meses, dias, diasTotais, diasNosAnos, diasNosMeses;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("\n Entre com sua idade em anos: ");
		anos = leia.nextInt();
		System.out.println("\n Entre com sua idade em meses: ");
		meses = leia.nextInt();
		System.out.println("\n Entre com sua idade em dias: ");
		dias = leia.nextInt();
		
		diasNosAnos = anos*365;
		diasNosMeses = meses * 30;
		
		diasTotais = dias + diasNosAnos + diasNosMeses;
		
		
		System.out.println(" Sua idade em dias é " + diasTotais);
		
		
		
	}

}
