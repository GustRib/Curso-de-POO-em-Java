public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l1 = new Lutador("Gustavo", "Chines", 22, 1.76f, 65.4f, 11, 2, 0);
        l1.apresentar();
        Lutador l2 = new Lutador("Jorge", "Brasileiro", 31, 1.70f, 60.1f, 2, 8, 5);
        l2.apresentar();

        l1.status();
        l2.status();

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l1, l2);
        UEC01.lutar();
    }
}