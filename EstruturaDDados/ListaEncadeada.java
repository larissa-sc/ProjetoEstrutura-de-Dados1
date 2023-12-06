package EstruturaDDados;

   

public class ListaEncadeada {
    private No inicio;
    private No fim;
    private int tamanho;
    
 class No {
    Object elemento;
    No proximo;
    No anterior;

    public No(Object elemento) {
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }
}
 
    public ListaEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void consultar(int indice) {
        if (indice < 1 || indice > tamanho) {
            System.out.println("Índice não localizado na lista.");
        } else {
            No atual = inicio;
            for (int i = 1; i < indice; i++) {
                atual = atual.proximo;
            }
            System.out.println("O elemento da posição " + indice + " é: " + atual.elemento);
        }
    }

    public void add(int indice, Object elemento) {
        if (indice < 1 || indice > tamanho + 1) {
            System.out.println("Não é possível adicionar o elemento nesta posição.");
        } else {
            No novoNo = new No(elemento);
            if (tamanho == 0) {
                inicio = novoNo;
                fim = novoNo;
            } else if (indice == 1) {
                novoNo.proximo = inicio;
                inicio.anterior = novoNo;
                inicio = novoNo;
            } else if (indice == tamanho + 1) {
                novoNo.anterior = fim;
                fim.proximo = novoNo;
                fim = novoNo;
            } else {
                No atual = inicio;
                for (int i = 1; i < indice - 1; i++) {
                    atual = atual.proximo;
                }
                novoNo.proximo = atual.proximo;
                novoNo.anterior = atual;
                atual.proximo.anterior = novoNo;
                atual.proximo = novoNo;
            }
            tamanho++;
            System.out.println("Elemento " + elemento + " adicionado com sucesso.");
        }
    }

    public void remover(int indice) {
        if (indice < 1 || indice > tamanho) {
            System.out.println("Não é possível remover nenhum elemento pois a posição não existe.");
        } else {
            if (tamanho == 1) {
                inicio = null;
                fim = null;
            } else if (indice == 1) {
                inicio = inicio.proximo;
                inicio.anterior = null;
            } else if (indice == tamanho) {
                fim = fim.anterior;
                fim.proximo = null;
            } else {
                No atual = inicio;
                for (int i = 1; i < indice; i++) {
                    atual = atual.proximo;
                }
                atual.anterior.proximo = atual.proximo;
                atual.proximo.anterior = atual.anterior;
            }
            tamanho--;
            System.out.println("Elemento removido com sucesso.");
        }
    }

    public void imprimir() {
        if (tamanho == 0) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("\n ");
            No atual = inicio;
            while (atual != null) {
                System.out.println(atual.elemento);
                atual = atual.proximo;
            }
        }
    }
}