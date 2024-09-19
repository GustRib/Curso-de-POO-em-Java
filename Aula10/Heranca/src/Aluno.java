public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    // super(no, id, sx);

    public void cancelarMatricula() {
        System.out.println("Matricula será cancelada!");
        this.matricula = 0;
    }

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade manualmente de " + this.nome);
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
