import java.util.Scanner;
public class EstruturasCondicionais2 {
    private static final Scanner
    ENTRADA = new Scanner(System.in);
    public static void main(String[] args) {
        int a = ENTRADA.nextInt();
        int b = ENTRADA.nextInt();
        // if aninhado
        if (a == 2) {
        System.out.println("A é 2");
        } else if (a > 10) {
        System.out.println("A maior que 10");
        } else if (b != a) {
        System.out.println("A e B não batem!");
        } else {
        System.out.println("Nenhum teste deu true");
        }
    }
}
