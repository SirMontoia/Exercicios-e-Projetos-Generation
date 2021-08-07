package Programa��oOrientadaaObjetos;

public class ExercicioTesteAviao {

	public static void main(String[] args) {
		
		ExercicioClasseAviao aviao = new ExercicioClasseAviao  ("Boeing" , 'A' , 60.0 , 350 );
		
		aviao.imprimirInfoAviao();
		
		System.out.println ("Um avi�o novo foi encomendado, com mais espa�os e cadeiras");
		
		aviao.setDimensaoAviao(470);
		aviao.setNumeroLugares(700);
		aviao.imprimirInfoAviao();
		
		System.out.println ("Um avi�o de outro modelo, com mesmas dimens�es, mas com outro motor, foi encomendado");
		
		aviao.setModeloAviao("Avi�o de papel");
		aviao.setModeloMotor('C');
		aviao.imprimirInfoAviao();
		
		

	}

}
