package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ExercicioEstoqueLista {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Collection<String> estoque = new ArrayList(); 
		int escolha;
		
		estoque.add("Banana");
		estoque.add("Melão");
		estoque.add("Twix");
		estoque.add("Bis");
		estoque.add("Vassoura");
		
		
		do {
			System.out.println("Bem vindo! Segue abaixo o menu de opções:");
			System.out.println("*******************************************************");
			System.out.println("\n 1 -Adicionar produtos no estoque"
							+ "\n 2 - remover produtos do estoque"
							+ "\n 3 - Atualizar produtos no estoque"
							+ "\n 4 - Mostrar os produtos do estoque");
			System.out.println("*******************************************************");
		    escolha = leia.nextInt();
			
			switch(escolha) {
				
				case 1:
					leia.nextLine();
					System.out.println("Por favor, entre com o produto que deseja adicionar");
					String produto = leia.nextLine();
					estoque.add(produto);
					break;
					
				case 2:
					leia.nextLine();
					System.out.println("Por favor, entre com o produto que deseja remover");
					String produtoremover = leia.nextLine();
					
					if(estoque.contains(produtoremover)) {
						
						estoque.remove(produtoremover);
					}
					else {
						System.out.println("Desculpe, esse item não existe. Digite novamente.");
						
					}
					break;
					
				case 3: 
					leia.nextLine();
					System.out.println("Por favor, entre com o produto que deseja atualizar");
					String produtoatualizar = leia.nextLine();
					System.out.println("Digita o produto que entrará no lugar de" + produtoatualizar + ":");
					String novoproduto = leia.next();
					
					if(estoque.contains(produtoatualizar)) {
						estoque.remove(produtoatualizar);
						estoque.add(novoproduto);
					}
					else {
					System.out.println("Produto não encontrado!");
					}
					break;
					
				case 4:
					System.out.println("Produtos no estoque: ");
					System.out.println("\n" +estoque);
					break;
					
				default:
					System.out.println("Programa finalizado! Você será retornado ao menu principal!");
					
					
			
					
			
			
		
		
				
			}
		
		}while (escolha !=0);
		
		System.out.println("_____   _____   _____         _____   _____   ______________  ______   ____   _____     \n"
				+ "        |  _  | |     | |  _  |       | ____| |     | |   __    __   | |    |  |  _ | |  _  |    \n"
				+ "        | |_| | |  _  | | |_| |       | |     |  _  | |  |  |  |  |  | | ___|  | |_|| | |_| |    \n"
				+ "        |  _ |  | |_| | |  _  |       | |     | |_| | |  |  |  |  |  | | |     |  __| |  _  |    \n"
				+ "        | |_| | |     | | | | |       | |___  |     | |  |  |  |  |  | | |     |      | | | |    \n"
				+ "        |_____| |_____| |_| |_|       |_____| |_____| |__|  |__|  |__| |_|     |___   |_| |_|    \n"
				+ "        "
				+ "      ");
				                		
				
	}

}
