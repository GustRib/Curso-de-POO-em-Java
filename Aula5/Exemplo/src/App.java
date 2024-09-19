public class App {
    public static void main(String[] args) throws Exception {
        //ContaBanco gustavo = new ContaBanco();
        ContaBanco raysa = new ContaBanco();
        //gustavo.abrirConta("CC");
        raysa.abrirConta("CP");
        raysa.depositar(200);
        raysa.sacar(30);
        raysa.fecharConta();
        raysa.sacar(300);
        raysa.fecharConta();
        raysa.sacar(20);
        raysa.fecharConta();

    }
}
