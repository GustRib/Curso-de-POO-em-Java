public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC"){
            saldo = 50;
        }
        else if(t == "CP") {
            saldo = 150;
        }

        setDono("Lia");
        System.out.println("Conta da " + getDono() + " criada com sucesso!");
        System.out.println("Saldo atual: " + saldo + " R$");
    }

    public void fecharConta() {
        if(saldo > 0) {
            System.out.println("Impossivel fechar a conta pois seu saldo eh de: " + getSaldo() + "R$");
        }
        else if(saldo == 0) {
            System.out.println("Nao foi possivel fechar a conta, voce esta devendo ao banco!");
        }
        else {
            setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }
    

    public void depositar(float v) {
        if(status = true) {
            setSaldo(getSaldo() + v);
            System.out.println("Novo saldo apos depositar: " + getSaldo() + "R$");
        }
        else {
            System.out.println("Impossivel depositar!");
        }
    }

    public void sacar(float v) {
        if(getStatus() == true) {
            if(saldo >= v) {
                setSaldo(getSaldo() - v);
                System.out.println("Novo saldo apos sacar: " + getSaldo() + "R$");
            }
            else {
                System.out.println("Saldo insuficiente!");
            }
        }
        else {
            System.out.println("Impossivel sacar!");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if(getTipo() == "CC") {
            v = 12;
        }
        else if(getTipo() == "CP") {
            v = 20;
        }
        if(getStatus() == true) {
            if(saldo > v) {
                setSaldo(getSaldo() - v);
            }
        }
        else {
            System.out.println("Impossivel pagar!");
        }
    }

    public ContaBanco() {
        saldo = 0;
        status = false;
    }

    public int getnumConta() {
        return numConta;
    }

    public void setnumConta(int n) {
        numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        status = s;
    }
}
