
public class App {
    public static void main(String[] args)  throws Exception {
        //var notas = criarVetor(10, 10);
        ListaLigada lista = new ListaLigada();
        System.out.println(lista.toString());
        // primeio: nulo, ultimo: nulo, tamanho = 0

        lista.adicionaComeco("Lilo");
        System.out.println(lista.toString());
        // primeiro: lilo, ultimo: lilo, tamanho: 1

        lista.adicionaComeco("Zé");
        System.out.println(lista.toString());
    
        lista.adicionaComeco("Sara");
        System.out.println(lista.toString());
    
        lista.adicionaFim("Matheus");
        System.out.println(lista.toString());

        lista.adicionaFim("Zahara");
        System.out.println(lista.toString());

        System.out.println("Posicao 0: " + lista.getDado(0));
        System.out.println("Posicao 2: " + lista.getDado(2));
        System.out.println("Posicao 4: " + lista.getDado(4));

        lista.adiciona(2, "Liynaa");
        System.out.println(lista.toString());
    }
}
