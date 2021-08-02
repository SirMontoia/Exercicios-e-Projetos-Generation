/*7. Um sistema de equações lineares do tipo:

, pode ser resolvido segundo mostrado abaixo :*/

package Turma29;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Entre com o coeficiente a :");
		a = leia.nextDouble();
		System.out.println("Entre com o coeficiente b :");
		b = leia.nextDouble();
		System.out.println("Entre com o coeficiente c :");
		c = leia.nextDouble();
		System.out.println("Entre com o coeficiente d :");
		d = leia.nextDouble();
		System.out.println("Entre com o coeficiente e :");
		e = leia.nextDouble();
		System.out.println("Entre com o coeficiente f :");
		f = leia.nextDouble();
		
		x = (c*e) - (b*f) / (a*e) - (b*d);
		
		y= (a*f) - (c*d) / (a*e) - (b*d);
		
		System.out.printf("Com a valendo " + a + " ,b valendo " + b + " ,c valendo "+ c + " ,d valendo " + d + " ,e valendo " + e + " e f valendo " + f + ", x vale %2.2f " , x , " e y vale %2.2f " , y);
		
		
		
		
	}
	

}
