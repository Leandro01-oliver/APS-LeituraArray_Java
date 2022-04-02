import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Context {

    private ListaLigada cursos = new ListaLigada();
    private ListaLigada disciplinas = new ListaLigada();
   
    public ListaLigada getCursos() {
        return cursos;
    }
    public ListaLigada getDisciplina() {
        return disciplinas;
    }

    public Context() throws IOException {
        carregaCursos();
        carregaDisciplinas();
    }

    private void carregaCursos() throws IOException {
        FileReader arq = new FileReader("Cursos.txt");
        BufferedReader leitor = new BufferedReader(arq);
        var linha = leitor.readLine();
        while (linha != null) {
            String[] dadosCurso = linha.split(";");
            var curso = new Curso(
                    Integer.parseInt(dadosCurso[0]),
                    dadosCurso[1],
                    Integer.parseInt(dadosCurso[2]));
            cursos.adicionaFim(curso);
            linha = leitor.readLine();
        }
        leitor.close();
        arq.close();
    }


    private void carregaDisciplinas() throws IOException {
        FileReader arq = new FileReader("Disciplinas.txt");
        BufferedReader leitor = new BufferedReader(arq);
        var linha = leitor.readLine();
        while (linha != null) {
            String[] dadosDisciplina = linha.split(";");
            var disciplina = new Disciplina(
                    Integer.parseInt(dadosDisciplina[0]),
                    dadosDisciplina[1],
                    Integer.parseInt(dadosDisciplina[2]));
            disciplina.adicionaFim(disciplina);
            linha = leitor.readLine();
        }
        leitor.close();
        arq.close();
    }

}
