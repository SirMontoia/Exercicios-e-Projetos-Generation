package ProgramaçãoOrientadaaObjetos;

public class ExercicioTesteCliente {

	public static void main(String[] args) {
		
		// Para testar, primeiro se faz o instanciamento da classe criada anteriormente
		
		ExercicioClasseCliente cliente = new ExercicioClasseCliente ("João" , "Lesão nas pernas", 1.90, 74.5);
		
		//Uso dos métodos criados 
		
		cliente.imprimirInfo();
		
		System.out.println("Atenção! Comorbidade equivocada.");

		cliente.setComorbidade("Lesão nos ombros");
		cliente.imprimirInfo();
		
		System.out.println("Ops! Nome registrado incorretamente!");
		
		cliente.setNome("Drácula");
		cliente.imprimirInfo();
		
		System.out.println("Peso coletado errôneo.");
		
		cliente.setPeso(85.0);
		cliente.imprimirInfo();
		
		System.out.println("Altura informada está errada!");
		
		cliente.setAltura(2.10);
		cliente.imprimirInfo();
		
	}

}
