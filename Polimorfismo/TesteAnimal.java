package Polimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		 	
		ClasseCachorro cachorro = new ClasseCachorro();
		cachorro.setRaca("Bulldog");
		cachorro.setEmissaosom("Late");
		
		ClasseCavalo cavalo = new ClasseCavalo();
		cavalo.setPorte("Spirit");
		cavalo.setEmissaosom("Relincha");
		
		ClassePregui�a pregui�a = new ClassePregui�a();
		pregui�a.setSobeArvore(true);
		pregui�a.setEmissaosom("N�o faz barulho");

		ClasseAnimal[] animal = new ClasseAnimal[3];
		animal [0] = cachorro;
		animal[1] = cavalo;
		animal[2] = pregui�a;
		
		for(ClasseAnimal animais:animal) {
			
			System.out.println(animais.getEmissaosom());
		}
	}

}
