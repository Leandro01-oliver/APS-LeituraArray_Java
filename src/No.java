public class No {
    private Object dado;
    private No proximo; 

    public No(Object dado, No proximo) {
        this.dado = dado;
        this.proximo = proximo;
    }
    public No(Object dado) {
        this.dado = dado;
    }

    public Object getDado() {
        return dado;
    }

    public void setDado(Object value) {
        dado = value;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No value) {
        proximo = value;
    }
}
