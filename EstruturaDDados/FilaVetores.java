package EstruturaDDados;

public class FilaVetores {
	Object[] fila;
	int tamanho;
	int inicio;
	int fim;
	
	public FilaVetores() {
		this.fila = new Object[10];
		this.tamanho = 0;
		this.inicio = 0;
		this.fim = 0;
	}
	
	public void consultar() {
		if(tamanho==0) {
			System.out.println("Erro: a fila está vazia, não é possível consultar o primeiro da fila.");
		}
		else{System.out.println("O primeiro da fila é " + fila[inicio]);
		}
	}
	
	public void add(Object elemento) {
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
		}else{
			System.out.println("\n ");
			for (int i = 0; i < tamanho; i++) {
				System.out.print("[" + fila[(inicio + i) % fila.length] + "]" + ", ");
			}
		}
	}
}
