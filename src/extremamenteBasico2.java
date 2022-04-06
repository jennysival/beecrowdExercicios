import java.util.Scanner;

public class extremamenteBasico2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        int A = leitor.nextInt();

        System.out.println("Digite o 2º número: ");
        int B = leitor.nextInt();

        int X = A+B;

        System.out.println("X = "+X);
    }
}
