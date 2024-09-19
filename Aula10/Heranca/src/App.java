public class App {
    public static void main(String[] args) throws Exception {

        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Visitante v1 = new Visitante();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();


        p2.setNome("Maria");
        p3.setNome("Pedro");
        p4.setNome("Raul");
        v1.setNome("Raulo");
        b1.setNome("Daniel");
        t1.setNome("Arthur");


        p2.setSexo("F");
        p2.setCurso("Engenharia");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        p2.setIdade(22);
        p2.pagarMensalidade();
        b1.pagarMensalidade();
        t1.praticar();

        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(v1.toString());
        System.out.println(t1.toString());
}
}
