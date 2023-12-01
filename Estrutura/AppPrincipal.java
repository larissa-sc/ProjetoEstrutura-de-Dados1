package Estrutura;

import java.util.Scanner;

public class AppPrincipal {
	public static void main(String[] args) {
		
		ListaVetores lista = new ListaVetores();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			menuPrincipal();
			int escolha = scan.nextInt();
			
			if (escolha == 1) {
				menuLista(scan, lista);
			}
		}
	}

	private static void menuLista(Scanner scan, ListaVetores lista) {
		System.out.println("--------- Menu de funções ---------" +
							"\n 1. Adicionar elemento a lista" +
							"\n 2. Remover elemento" +
							"\n 3. Consultar elemento na posição" +
							"\n 4. Imprimir lista" +
							"\n 5. Retornar ao menu anterior" +
							"\n Digite o número da opção desejada: \n");
		
		int escolhaL = scan.nextInt();
		
		if (escolhaL == 1) {
			System.out.println("Informe a posição do elemento que você quer adicionar (acima de 1): \n");
			int indice = scan.nextInt();
			scan.nextLine();
			System.out.println("Informe o elemento a ser adicionado: \n");
			String elemento = scan.nextLine();
			lista.add(indice, elemento);
		} else if (escolhaL == 2) {
			System.out.println("Informe a posição que o elemento que você quer remover está: \n");
			int indice = scan.nextInt();
			lista.remover(indice);
		} else if (escolhaL == 3) {
			System.out.println("Informe a posição que você gostaria de consultar o elemento: \n");
			int indice = scan.nextInt();
			lista.consultar(indice);
		} else if (escolhaL == 4) {
			lista.imprimir();
		} else if (escolhaL == 5) {
			menuLista(scan, lista);
		} else {
			System.out.println("Opção inválida!");
		}
		
		System.out.println("\n Deseja continuar implementando a lista? (S/N): ");
	    String resposta = scan.next().toUpperCase();
	    if (resposta.equals("S")) {
	    	menuLista(scan, lista);
	    }
	}

	private static void menuPrincipal() {
		System.out.println("--------- Menu de implementação ---------" +
				"\n 1. Lista" +
				"\n 2. Fila" +
				"\n 3. Pilha" +
				"\n Digite o número da opção desejada: \n");
	}
}
