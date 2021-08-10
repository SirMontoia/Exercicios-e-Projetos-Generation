package Polimorfismo;

public class ClasseCavalo extends ClasseAnimal {
	
	private String porte;

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	
	public String emitirsom() {
		
		return "O cavalo" + super.getNome() + "!";
	}



}




