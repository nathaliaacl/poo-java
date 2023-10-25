import java.util.Scanner;

public class EstruturasCondicionais {
    private static final Scanner
        ENTRADA = new Scanner(System.in);
    public static void main(String[] args){
        int a = ENTRADA.nextInt();
        int b = ENTRADA.nextInt();
        if (a > 3) {
            System.out.println("A é grande!");
            }
            // if...else
            if (a == b) {
            System.out.println("A é igual a B!");
            a = a + b;
            } else {
            System.out.println("A não é igual a B!");
            }
    }
}
