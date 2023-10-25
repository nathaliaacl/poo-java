
public class EstruturasRepeticao {
    public static void main(String[] args) {
        int a = 2;
        int b = a + 3;
        // Laço com teste no início (pode não entrar)
        while (b < 10) {
            a = a + 1;
            b = b + a;
        }
        // Laço com teste no fim (sempre entra pelo
        // menos uma vez)
        do {
            a = a + 1;
            b = b + a;
        } while (b < 10);
        // Contador
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
