import java.sql.SQLOutput;
import java.util.Scanner;

public class ControleFluxoSwitch2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = input.nextInt();

        switch (valor){
            case 1,2,3 -> {
                System.out.println("Certo");
            }
            case 4 -> {
                System.out.println("Errado");
            }
            case 5 -> {
                System.out.println("Talvez");
            }
            default -> {
                System.out.println("Opção inválida.");
            }
        }
    }
}
