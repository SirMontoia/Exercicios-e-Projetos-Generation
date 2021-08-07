/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package ProgramaçãoOrientadaaObjetos;

public class ExercicioClasseCliente {
	
	
	//Primeiro, obter os atributos da classe
	private String nome;
	private Double peso;
	private String comorbidade;
	private Double altura;
	
	// Segundo, crie o método construtor ==> Consegue chamar classe automovel em outra classe
	
	public ExercicioClasseCliente (String nome, String comorbidade, Double altura, Double peso) {
		
		this.nome= nome;
		this.peso = peso;
		this.comorbidade = comorbidade;  // Aqui se inicializou os atributos
		this.altura = altura;
		
		
	}
	
	public void imprimirInfo(){
		
		System.out.println(nome + " tem peso igual a " + peso + " e altura de " + altura + ". Sua comorbidade é " + comorbidade );
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getComorbidade() {
		return comorbidade;
	}

	public void setComorbidade(String comorbidade) {
		this.comorbidade = comorbidade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
	
	
	

}
