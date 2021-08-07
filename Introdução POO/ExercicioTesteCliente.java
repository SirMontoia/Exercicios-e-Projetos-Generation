package Programa��oOrientadaaObjetos;

public class ExercicioTesteCliente {

	public static void main(String[] args) {
		
		// Para testar, primeiro se faz o instanciamento da classe criada anteriormente
		
		ExercicioClasseCliente cliente = new ExercicioClasseCliente ("Jo�o" , "Les�o nas pernas", 1.90, 74.5);
		
		//Uso dos m�todos criados 
		
		cliente.imprimirInfo();
		
		System.out.println("Aten��o! Comorbidade equivocada.");

		cliente.setComorbidade("Les�o nos ombros");
		cliente.imprimirInfo();
		
		System.out.println("Ops! Nome registrado incorretamente!");
		
		cliente.setNome("Dr�cula");
		cliente.imprimirInfo();
		
		System.out.println("Peso coletado err�neo.");
		
		cliente.setPeso(85.0);
		cliente.imprimirInfo();
		
		System.out.println("Altura informada est� errada!");
		
		cliente.setAltura(2.10);
		cliente.imprimirInfo();
		
	}

}
