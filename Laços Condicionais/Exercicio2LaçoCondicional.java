//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

package Turma29;

import java.util.Scanner;

public class Exercicio2La�oCondicional {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numero1, numero2, numero3;
		
		System.out.println("Entre com o n�mero 1: ");
		numero1 = leia.nextDouble();
		System.out.println("Entre com o n�mero 2: ");
		numero2 = leia.nextDouble();
		System.out.println("Entre com o n�mero 3: ");
		numero3 = leia.nextDouble();
		
		if (numero1>numero2 && numero1>numero3) 
		{
			
			if (numero2>numero3) 
			{
				System.out.println( numero1 + ">" + numero2 +">" + numero3);
				
			}
			else {
				System.out.println( numero1 + ">" + numero3 +">" + numero2);
			}
			
		}
		
		if(numero2>numero1 && numero2>numero3) 
		{
			
			if(numero1>numero3) 
			{
				System.out.println( numero2 + ">" + numero1 +">" + numero3);
			}
			else 
			{
				System.out.println( numero2 + ">" + numero3 +">" + numero1);
		}
		
		if(numero3>numero1 && numero3>numero2) 
		{
			
			if(numero1>numero2) 
			{
				System.out.println( numero3 + ">" + numero1 +">" + numero2);
			}
			else 
			{
				System.out.println( numero3 + ">" + numero2 +">" + numero1);
			}
		}
		
		
	}
	

}
}
