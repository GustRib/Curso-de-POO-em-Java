public class Tecnico extends Aluno{
    private String registroProfissional;

    public void praticar() {
        System.out.println("O tecnico " + this.nome + " esta praticando programacao nesse momento.");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
