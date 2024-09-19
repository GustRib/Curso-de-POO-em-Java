import java.util.Random;

public class Luta {
    private int rounds;
    private boolean aprovada;
    private Lutador desafiado;
    private Lutador desafiante;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if(this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                break;

                case 1:
                    System.out.println("Vitoria do: " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                break;

                case 2:
                    System.out.println("Vitoria do: " + desafiante.getNome());
                    desafiado.perderLuta();;
                    desafiante.ganharLuta();
                break;

            }
        }else {
            System.out.println("A luta nao pode acontecer!");
        }
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador de) {
        this.desafiante = de;
    }
}

