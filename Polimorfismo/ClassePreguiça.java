package Polimorfismo;

public class ClassePreguiça extends ClasseAnimal {
	private boolean sobeArvore;

	public boolean isSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(boolean sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	@Override
	public String emitirsom() {
		
		return "A preguiça" + super.getNome() + "!";
		
	}
	
	
	
}
