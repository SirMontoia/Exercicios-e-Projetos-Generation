/*3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra:*/

package Turma29;

import java.util.Scanner;

public class Exercicio3La�oCondicional {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.println("\n Entre com sua idade:");
		idade = leia.nextInt ();
		
		if (idade>=10 && idade<=14) 
		{
			
        System.out.println("\n Voc� est� na faixa infantil");
          
		}
		else if (idade>=15 && idade<=17) 
		{
			
			System.out.println("\n Voc� est� na faixa juvenil");
		}
		else if(idade>=18 && idade<=25) 
		{
			
			System.out.println("\n Voc� est� na faixa adulto");
		}
		else {
			System.out.println("\n Voc� est� fora do escopo de an�lise");
		}
		
		}

}
