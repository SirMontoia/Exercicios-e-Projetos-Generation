package ProgramaçãoOrientadaaObjetos;

public class ExercicioTesteAviao {

	public static void main(String[] args) {
		
		ExercicioClasseAviao aviao = new ExercicioClasseAviao  ("Boeing" , 'A' , 60.0 , 350 );
		
		aviao.imprimirInfoAviao();
		
		System.out.println ("Um avião novo foi encomendado, com mais espaços e cadeiras");
		
		aviao.setDimensaoAviao(470);
		aviao.setNumeroLugares(700);
		aviao.imprimirInfoAviao();
		
		System.out.println ("Um avião de outro modelo, com mesmas dimensões, mas com outro motor, foi encomendado");
		
		aviao.setModeloAviao("Avião de papel");
		aviao.setModeloMotor('C');
		aviao.imprimirInfoAviao();
		
		

	}

}
