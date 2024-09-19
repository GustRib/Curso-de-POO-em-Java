public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Reptil r = new Reptil();

        m.setPeso(7.50f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("");
        System.out.println("");

        c.setPeso(55.4f);
        c.setIdade(14);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        System.out.println("");
        System.out.println("");

        r.setPeso(0.600f);
        r.setIdade(1);
        r.setMembros(22);
        r.locomover();
        r.alimentar();
        r.emitirSom();
        System.out.println("");
        System.out.println("");

        System.out.println(m.toString());
        System.out.println(c.toString());
        System.out.println(r.toString());
    }
}
