package ProgramaçãoOrientadaaObjetos;

public class ExercicioClasseAviao {

	private char modeloMotor;
	private double dimensaoAviao;
	private int numeroLugares;
	private String modeloAviao;


	public ExercicioClasseAviao (String modeloAviao, char modeloMotor, double dimensaoAviao, int numeroLugares) {
		
		this.modeloMotor = modeloMotor;
		this.dimensaoAviao = dimensaoAviao;
		this.numeroLugares = numeroLugares;
		this.modeloAviao = modeloAviao;
	}
	
	public void imprimirInfoAviao() {
		
		System.out.println("O avião em questão é do modelo " + modeloAviao +", tem motor do tipo " + modeloMotor + ", dimesões iguais a" + dimensaoAviao + "m³" + " e tem " + numeroLugares + " número de lugares");
	}

	public char getModeloMotor() {
		return modeloMotor;
	}

	public void setModeloMotor(char modeloMotor) {
		this.modeloMotor = modeloMotor;
	}

	public double getDimensaoAviao() {
		return dimensaoAviao;
	}

	public void setDimensaoAviao(double dimensaoAviao) {
		this.dimensaoAviao = dimensaoAviao;
	}

	public double getNumeroLugares() {
		return numeroLugares;
	}

	public void setNumeroLugares(int numeroLugares) {
		this.numeroLugares = numeroLugares;
	}

	public String getModeloAviao() {
		return modeloAviao;
	}

	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}

	

}

