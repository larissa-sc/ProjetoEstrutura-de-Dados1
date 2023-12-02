package estrutura;

public class PilhaVetores {
	String[] pilha;
	int topo;
	
	public PilhaVetores() {
		this.pilha = new String[10];
		this.topo = 0;
	}
	
	public void consultar() {
		System.out.println("O topo da pilha é " + pilha[topo]);
	}
	
	public void add(String elemento) {
		if (pilha[topo] != null) {
			System.out.println("Pilha cheia! Remova o topo da pilha para adicionar um novo elemento.");
		} 
		else {
			pilha[topo] = elemento;
			topo++;
		}
	}
	
	public void remover() {
		if (topo == 0) {
			System.out.println("Não é possível remover, a pilha está vazia.");
		}
		else {
			System.out.println("Elemento " + pilha[topo-1] + " removido com sucesso!");
			pilha[--topo] = null;
		}
	}
	
	public void imprimir() {
		if (topo == 0) {
			System.out.println("A fila está vazia.");
		}
		System.out.println("\n ");;
		for (int i = topo; i >= 0; --i) {
			System.out.println(pilha[i]);
		}
	}
}
