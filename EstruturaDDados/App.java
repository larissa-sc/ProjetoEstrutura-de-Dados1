package EstruturaDDados;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		ListaVetores lista = new ListaVetores();
		FilaVetores fila = new FilaVetores();
		PilhaVetores pilha = new PilhaVetores();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			menuPrincipal();
			int escolha = scan.nextInt();
			
			if (escolha == 1) {
				menuLista(scan, lista);
			}
			
			else if (escolha == 2) {
				menuFila(scan, fila);
			}
			
			else if (escolha == 3) {
				menuPilha(scan, pilha);
			}
		}
	}
	
	private static void menuPilha(Scanner scan, PilhaVetores pilha) {
		System.out.println("--------- Menu de funções da pilha ---------" +
				"\n 1. Adicionar elemento" +
				"\n 2. Remover elemento" +
				"\n 3. Consultar elemento do topo da pilha" +
				"\n 4. Imprimir ordem da pilha" +
				"\n Digite o número da opção desejada: \n");

		int escolha = scan.nextInt();
		
		switch (escolha) {
		
		case 1: 
			System.out.println("Informe o elemento a ser adicionado: \n");
			scan.nextLine();
			pilha.add(scan.nextLine());
			implementarPilha(scan, pilha);
			break;
		
		case 2:
			pilha.remover();
			implementarPilha(scan, pilha);
			break;
		
		case 3:
			pilha.consultar();
			implementarPilha(scan, pilha);
			break;
		
		case 4:
			pilha.imprimir();
			implementarPilha(scan, pilha);
			break;
		
		default:
			System.out.println("Opção inválida! \n");
		}		
	}

	private static void implementarPilha(Scanner scan, PilhaVetores pilha) {
		System.out.println("\n Deseja continuar implementando a pilha? (S/N): ");
	    String resposta = scan.next().toUpperCase();
	    if (resposta.equals("S")) {
	    	menuPilha(scan, pilha);
	    }
	}

	private static void menuFila(Scanner scan, FilaVetores fila) {
		System.out.println("--------- Menu de funções da fila ---------" +
				"\n 1. Adicionar elemento" +
				"\n 2. Remover elemento" +
				"\n 3. Consultar primeiro elemento" +
				"\n 4. Imprimir ordem da fila" +
				"\n Digite o número da opção desejada: \n");

		int escolha = scan.nextInt();
		
		switch (escolha) {
		
		case 1: 
			System.out.println("Informe o elemento a ser adicionado: \n");
			scan.nextLine();
			fila.add(scan.nextLine());
			implementarFila(scan, fila);
			break;
		
		case 2:
			fila.remover();
			implementarFila(scan, fila);
			break;
		
		case 3:
			fila.consultar();
			implementarFila(scan, fila);
			break;
		
		case 4:
			fila.imprimir();
			implementarFila(scan, fila);
			break;
		
		default:
			System.out.println("Opção inválida! \n");
		}		
	}

	private static void implementarFila(Scanner scan, FilaVetores fila) {
		System.out.println("\n Deseja continuar implementando a fila? (S/N): ");
	    String resposta = scan.next().toUpperCase();
	    if (resposta.equals("S")) {
	    	menuFila(scan, fila);
	    }
	}

	private static void menuLista(Scanner scan, ListaVetores lista) {
		System.out.println("--------- Menu de funções da lista ---------" +
							"\n 1. Adicionar elemento" +
							"\n 2. Remover elemento" +
							"\n 3. Consultar elemento na posição" +
							"\n 4. Imprimir lista" +
							"\n Digite o número da opção desejada: \n");
		
		int escolha = scan.nextInt();
		
		switch (escolha) {
		
		case 1: 
			System.out.println("Informe a posição do elemento que você quer adicionar (inicie a conteagem em 1): \n");
			int indice = scan.nextInt();
			scan.nextLine();
			System.out.println("Informe o elemento a ser adicionado: \n");
			lista.add(indice, scan.nextLine());
			implementarLista(scan, lista);
			break;
			
		case 2:
			System.out.println("Informe a posição que o elemento que você quer remover está: \n");
			int indice1 = scan.nextInt();
			lista.remover(indice1);
			implementarLista(scan, lista);
			break;
		
		case 3:
			System.out.println("Informe a posição que você gostaria de consultar o elemento: \n");
			int indice2 = scan.nextInt();
			lista.consultar(indice2);
			implementarLista(scan, lista);
			break;
			
		case 4:
			lista.imprimir();
			implementarLista(scan, lista);
			break;
			
		default:
			System.out.println("Opção inválida! \n");
		}
	}
	
	public static void implementarLista(Scanner scan, ListaVetores lista) {
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