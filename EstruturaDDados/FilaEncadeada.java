package EstruturaDDados;



public class FilaEncadeada {
    private No inicio;
    private No fim;
    private int tamanho;
    
class No {
    Object valor;
    No proximo;

    public No(Object valor) {
        this.valor = valor;
        this.proximo = null;
    }
}
    public FilaEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void consultar() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("O primeiro da fila é " + inicio.valor);
        }
    }

    public void add(Object elemento) {
        No novoNo = new No(elemento);

        if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }

        tamanho++;
    }

    public void remover() {
        if (isEmpty()) {
            System.out.println("Não é possível remover, a fila está vazia.");
        } else {
            System.out.println("Elemento " + inicio.valor + " removido com sucesso!");
            inicio = inicio.proximo;
            tamanho--;

            if (isEmpty()) {
                fim = null;
            }
        }
    }

    public void imprimir() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("\n");
            No atual = inicio;
            while (atual != null) {
                System.out.println(atual.valor);
                atual = atual.proximo;
            }
        }
    }

    private boolean isEmpty() {
        return tamanho == 0;
    }
}