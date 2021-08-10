package Polimorfismo;

public class ClasseCachorro extends ClasseAnimal {
	
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String emitirsom() {
		
		return "O cachorro" + super.getNome() + "!";
	}

	
	
}
