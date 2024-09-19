public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public void apresentar() {
        System.out.println("------------------------------------");
        System.out.println("CHEGOU A HORA: Apresentando o lutador " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Com " + this.idade + " anos");
        System.out.println(this.altura + " metros");
        System.out.println("Pesando " + this.peso);
        System.out.println("Com " + this.vitorias + " Vitorias");
        System.out.println("Com " + this.derrotas + " Derrotas");
        System.out.println("Com " + this.empates + " Empates");
    }

    public void status() {
        System.out.println(this.getNome() + "Eh um peso" + this.categoria);
        System.out.println("Com " + this.vitorias + " Vitorias");
        System.out.println("Com " + this.derrotas + " Derrotas");
        System.out.println("Com " + this.empates + " Empates");
    }

    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Categoria Invalida";
        }
        else if(this.peso <= 70.3) {
            this.categoria = "Leve";
        }
        else if(this.peso <= 83.9) {
            this.categoria = "Medio";
        }
        else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Categoria Invalida";
        }
    }


    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


}
