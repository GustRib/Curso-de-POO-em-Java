public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta("AZUL", "BIC", 1.0f);
        Caneta c2 = new Caneta("Vermelha", "BICSSON", 0.5f);

        c1.status();
        c2.status();
    }
}
