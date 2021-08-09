package ProgramaçãoOrientadaaObjetos;

public class ClasseAnimal {
	
	private String nome;
	private int idade;
	private boolean emissaosom;
	
	
	public ClasseAnimal (String n, int idade, boolean emissaosom) {
		
		this.nome = n;
		this.idade= idade;
		this.emissaosom = emissaosom;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isEmissaosom() {
		return emissaosom;
	}
	public void setEmissaosom(boolean emissaosom) {
		this.emissaosom = emissaosom;
	}

	
	
	
	
}




	
	
	