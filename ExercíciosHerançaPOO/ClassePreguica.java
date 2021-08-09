package ProgramaçãoOrientadaaObjetos;

public class ClassePreguica extends ClasseAnimal {

	private boolean subiremarvore;
	
	public ClassePreguica (String n, int idade, boolean emissaosom, boolean subiremarvore) {
		
		super(n, idade, emissaosom);
		this.subiremarvore = subiremarvore;
	
		
	}

	public boolean isSubiremarvore() {
		return subiremarvore;
	}

	public void setSubiremarvore(boolean subiremarvore) {
		this.subiremarvore = subiremarvore;
	}
	
}
