package ProgramaçãoOrientadaaObjetos;

public class ClasseCachorro extends ClasseAnimal {

	private String raca;
	private boolean correr;
	
	
	public ClasseCachorro (String n, int idade, boolean emissaosom, String raca, boolean correr) {
		
		super (n, idade, emissaosom);
		this.raca = raca;
		this.correr = correr;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	
	
	
	

}
