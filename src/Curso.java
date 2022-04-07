public class Curso {
    private int id;
    private String nome;  
    private String coordenador;
    private int cargaHoraria;

    public Curso(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String toString() {
        return nome + " (" + id + ")";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCoordenador() {
        return coordenador;
    }
    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
