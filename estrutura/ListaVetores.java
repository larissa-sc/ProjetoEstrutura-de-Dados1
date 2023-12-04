package estrutura;

public class ListaVetores {
	String[] lista;
	int tamanho;

	// método onde foi definido o tamanho máximo de elementos que a lista recebe
	public ListaVetores() {
		this.lista = new String[10];
		this.tamanho = 0;
	}

	// verifica se o índice existe na lista (vai ser medido em tamanho, pois o tamanho máximo não é o tamanho que a lista tem ao adicionar o item)
	public void consultar(int indice) {
		if (indice < 1 || indice > tamanho) {
			System.out.println("Índice não localizado na lista.");
		} else if (lista[indice-1] == null) {
			System.out.println("A posição está vazia.");
		}
		System.out.println("O elemento da posição " + indice + " é: " + lista[indice -1]);
	}

	public void add(int indice, String elemento) {
		indice = indice -1;  //uso para assumir o índice correto em código
		if(indice < 0 || indice > tamanho){   //quando o índice é maior que o tamanho da lista, não pode add
			System.out.println("Não é possível adicionar o elemento nesta posição.");
		} else if(tamanho == lista.length) {  //tamanho vai somando na implementação até igualar a capacidade máxima
			System.out.println("A lista está cheia.");
		} else {
			for (int i = tamanho; i > indice; i--) {
				lista[i] = lista[i-1];
			}
			lista[indice] = elemento;
			tamanho++;
			System.out.println("Elemento " + elemento + " adicionado com sucesso.");
		}
	}
	
	public void remover(int indice) {
		indice = indice -1;
		if(indice < 0 || indice >= tamanho){
			System.out.println("Não é possível remover nenhum elemento pois a posição não existe ou está vazia.");
		} else if(tamanho == 0) {
			System.out.println("A lista está vazia.");
		} else {
			lista[indice] = null;
			System.out.println("Elemento " + lista[indice] + " removido com sucesso.");
			for (int i = indice; i < tamanho; i++) {
				lista[i] = lista[i+1];
			}
			tamanho--;
		}
	}
	
	public void imprimir() {
		if (tamanho == 0) {
			System.out.println("A lista está vazia.");
		}
		System.out.println("\n ");;
		for (int i = 0; i < tamanho; i++) {
			System.out.println(lista[i]);
		}
	}
	
	public void substituir(int indice, String elemento) {
		indice = indice-1;
		if (indice >= tamanho) {
			System.out.println("A posição não existe pois não foi ocupada.");
		}
		else {
			System.out.println("O elemento " + lista[indice] + " foi substituído por " + elemento + " na posição " + (indice +1));
			lista[indice] = elemento;
		}
	}
}
