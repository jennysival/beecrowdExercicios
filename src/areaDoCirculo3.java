import java.util.Scanner;

public class areaDoCirculo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nº do raio (ex: 2,00): ");
        double raio = leitor.nextFloat();

        double area = 3.14159*(raio*raio);

        System.out.println("A = "+area);

    }
}
