package estrutura;

public class FilaVetores {
	String[] fila;
	int tamanho;
	int inicio;
	int fim;
	
	public FilaVetores() {
		this.fila = new String[10];
		this.tamanho = 0;
		this.inicio = 0;
		this.fim = 0;
	}
	
	public void consultar() {
		if(tamanho==0) {
			System.out.println("Erro: a fila está vazia, não é possível consultar o primeiro da fila.");
		}
		System.out.println("O primeiro da fila é " + fila[inicio]);
	}
	
	public void add(String elemento) {
		if (fila[fim] != null) {
			System.out.println("Fila cheia! Remova o primeiro da fila para adicionar o próximo");
		} 
		else {
			fila[fim] = elemento;
			fim = (fim + 1) % fila.length;
			tamanho++;
		}
	}
	
	public void remover() {
		if (tamanho == 0) {
			System.out.println("Não é possível remover, a fila está vazia.");
		}
		else {
			System.out.println("Elemento " + fila[inicio] + " removido com sucesso!");
			fila[inicio] = null;
			inicio = (inicio + 1) % fila.length;
			tamanho--;
		}
	}
	
	public void imprimir() {
		if (tamanho == 0) {
			System.out.println("A fila está vazia.");
		}
		System.out.println("\n ");;
		for (int i = 0; i < tamanho; i++) {
			System.out.println(fila[(inicio + i) % fila.length]);
		}
	}
	
	public int size() {
		return tamanho;
	}
	
	public boolean isEmpty() {
		if (tamanho == 0) {
			return true;
		}
		return false;
	}
}
