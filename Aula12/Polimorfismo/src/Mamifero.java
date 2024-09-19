public class Mamifero extends Animal{
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("O mamifero esta Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("O mamifero esta Mastigando");
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamifero esta fazendo WIIIIIIIIIIIIIIIII");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
