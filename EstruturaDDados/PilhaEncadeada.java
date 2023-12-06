package EstruturaDDados;

public class PilhaEncadeada {
    private No topo;
    private int tamanho;

    public PilhaEncadeada() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void consultar() {
        if (isEmpty()) {
            System.out.println("Erro: a pilha está vazia, não é possível consultar o elemento no topo.");
        } else {
            System.out.println("O topo da pilha é " + topo.getDado());
        }
    }

    public void adicionar(Object elemento) {
        No novoNo = new No(elemento);
        novoNo.setProximo(topo);
        topo = novoNo;
        tamanho++;
    }

    public void remover() {
        if (isEmpty()) {
            System.out.println("Não é possível remover, a pilha está vazia.");
        } else {
            System.out.println("Elemento " + topo.getDado() + " removido com sucesso!");
            topo = topo.getProximo();
            tamanho--;
        }
    }

    public void imprimir() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("\n ");
            No atual = topo;
            while (atual != null) {
                System.out.println(atual.getDado());
                atual = atual.getProximo();
            }
        }
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    private static class No {
        private Object dado;
        private No proximo;

        public No(Object dado) {
            this.dado = dado;
            this.proximo = null;
        }

        public Object getDado() {
            return dado;
        }

        public No getProximo() {
            return proximo;
        }

        public void setProximo(No proximo) {
            this.proximo = proximo;
        }
    }
}