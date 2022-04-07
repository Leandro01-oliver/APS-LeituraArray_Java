public class Stack<T> implements IStack<T> {
    private ListaLigada<T> lista;

    public Stack() {
        lista = new ListaLigada<T>();
    }

    // incluir um elemento no final da pilha
    public void push(T item) {
        lista.adicionaFim(item);
    }

    // retirar o último elemento da pilha
    public T pop() {
        if (!empty()) {
            var no = lista.getUltimo();
            var dado = no.getDado();
            lista.excluiFim();
            return dado;
        }
        return null;
    }

    // retorna o proximo elemento a ser retirado da pilha
    // sem efetivaente retirar
    public T peek() {
        if (!empty()) {
            var no = lista.getUltimo();
            var dado = no.getDado();
            return dado;
        }
        return null;
    }

    // verifica se a pilha está vazia
    public boolean empty() {
        return lista.getTamanho() == 0;
    }

    // retorna o tamanho da pilha
    public int size() {
        return lista.getTamanho();
    }

    // retorna a representação da pilha em texto
    public String toString() {
        return lista.toString();
    }
}
