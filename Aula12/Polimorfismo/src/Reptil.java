public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("O reptil esta Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("O reptil esta Engolindo");
    }

    @Override
    public void emitirSom() {
        System.out.println("O reptil esta fazendo SSSSSSSSSSSSSSSS");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}

