package Polimorfismo;

public class ClassePregui�a extends ClasseAnimal {
	private boolean sobeArvore;

	public boolean isSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(boolean sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	@Override
	public String emitirsom() {
		
		return "A pregui�a" + super.getNome() + "!";
		
	}
	
	
	
}
