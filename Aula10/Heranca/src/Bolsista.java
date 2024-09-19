public class Bolsista extends Aluno {
    private float bolsa;

    public void renovaBolsa() {
        System.out.println("Renovando bolsa de: " + this.nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " eh bolsista! Pagamento automatico realizado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
