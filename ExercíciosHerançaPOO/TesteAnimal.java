package Programa��oOrientadaaObjetos;

public class TesteAnimal {

	public static void main(String[] args) {
		
		ClasseAnimal peixe = new ClasseAnimal ("Peixe", 2, true);
		ClasseCachorro pastor = new ClasseCachorro ("B�ris", 10, true, "Pastor Alem�o", true);
		ClasseCavalo pedepano = new ClasseCavalo ("P� de pano", 5, true, "Pequeno", true);
		ClassePreguica sid = new ClassePreguica ("Sid", 3, true, true);
		
		System.out.println(peixe.getIdade());
		System.out.println(pastor.getRaca());
		System.out.println(pedepano.getPorte());
		System.out.println(sid.isSubiremarvore());

	}

}
