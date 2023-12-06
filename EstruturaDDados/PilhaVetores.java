package EstruturaDDados;

public class PilhaVetores {
	Object[] pilha;
	int topo;
	
	public PilhaVetores() {
		this.pilha = new Object[10];
		this.topo = 0;
	}
	
	public void consultar() {
		if(topo==0) {
			System.out.println("Erro: a pilha está vazia, não é possível consultar o elemento no topo.");
		}
		else {
            System.out.println("O topo da pilha é " + pilha[topo - 1]);
        }	
	}
	
	public void add(Object elemento) {
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
		else {
            System.out.println("\n ");
            for (int i = topo - 1; i >= 0; --i) {
                System.out.print("[ "+pilha[i]+" ]" + ", ");
            }
        }
	}
}
