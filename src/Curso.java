public class Curso {
    private int id;
    private String nome;
    private int CargaHoraria;

    public Curso(int id, String nome,int cargaHoraria) {
        this.id = id;
        this.nome = nome;
        this.CargaHoraria = cargaHoraria;
    }

    public String toString() {
        return id+"."+nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }
}
