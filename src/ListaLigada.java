public class ListaLigada {
    private No primeiro;
    private No ultimo;
    private int tamanho;

    public void adicionaComeco(Object dado) {
        // criando o nó com o dado, e definindo o proximo elemento (primeiro)
        No no = new No(dado, primeiro);

        // o primeiro deixa ser o primeiro, e o nó recem adicionado passa a
        // ser o primeiro
        primeiro = no;

        // quando a lista está vazia (tamanho 0), o último tb é o nó recem
        // adicionado
        if (tamanho == 0) {
            ultimo = primeiro;
        }

        // aumento o tamanho da lista em 1 elemento
        tamanho++;
    }

    public void adicionaFim(Object dado) {
        if (tamanho == 0) {
            adicionaComeco(dado);
        } else {
            No no = new No(dado);
            ultimo.setProximo(no);
            ultimo = no;
            tamanho++;
        }
    }

    public void adiciona(int posicao, Object dado) {
        if (posicao == 0)
            adicionaComeco(dado);
        else if (posicao == tamanho)
            adicionaFim(dado);
        else if (posicao >= 0 && posicao < tamanho) {
            No anterior = getNo(posicao - 1);
            No novo = new No(dado, anterior.getProximo());
            anterior.setProximo(novo);
            tamanho++;
        }
    }

    public No getNo(int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            No atual = primeiro;
            for (int i = 0; i < posicao; i++) {
                atual = atual.getProximo();
            }
            return atual;
        }
        return null;
    }

    public Object getDado(int posicao) {
        return getNo(posicao).getDado();
    }

    public String toString() {
        // retorna [] quando a lista está vazia
        if (tamanho == 0)
            return "[]";

        // inicia a construção da saída
        // toda lista começa com [ e termina com ]
        StringBuilder builder = new StringBuilder("[");

        // inicio a percorrer a lista do primeiro elemento
        // o nó atual será usado para percorrer a lsita
        No atual = primeiro;

        // percorrendo a lista
        for (int i = 0; i < tamanho - 1; i++) {
            // adicionando a lista o dado,
            builder.append(atual.getDado());
            builder.append(", ");

            // o nó atual é atualizado com o próximo (lembra que a lista é ligada)
            atual = atual.getProximo();
        }

        // sai da lista, e agora vou escrever o último elemento
        builder.append(atual.getDado());
        // e finalizar a saída com ]
        builder.append("]");

        // retorna o texto (string) que representa a lista
        return builder.toString();
    }

    public boolean existe(int posicao) {
        return posicao >= 0 && posicao <= tamanho;
    }

    public int contem(Object dado) {
        No atual = this.primeiro;
        int posicao = 0;
        while (atual != null) {

            if (atual.getDado().equals(dado)) {
                return posicao; // se contém, retorna a posição do elemento
            }
            atual = atual.getProximo();
            posicao++;
        }
        return -1; // não contém o dado na lista dinâmica
    }

    public void excluirComeco() {

    }

}
