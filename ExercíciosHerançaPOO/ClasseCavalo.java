package ProgramaçãoOrientadaaObjetos;

public class ClasseCavalo extends ClasseAnimal {

	private String porte;
	private boolean correr;

	public ClasseCavalo (String n, int idade, boolean emissaosom, String porte, boolean correr) {
		
		super (n, idade, emissaosom);
		this.correr = correr;
		this.porte= porte;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	
}


