import java.util.Scanner;

public class ControleFluxoSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o dia da semana para saber seu número: ");
        String semana = input.next().toLowerCase();

        switch (semana) {
            case "segunda" -> {
                System.out.println('2');
            }
            case "terça" -> {
                System.out.println('3');
            }
            case "quarta" -> {
                System.out.println('4');
            }
            case "quinta" -> {
                System.out.println('5');
            }
            case "sexta" -> {
                System.out.println('6');
            }
            case "sabado" -> {
                System.out.println('7');
            }
            case "domingo" -> {
                System.out.println('1');
            }
            default -> {
                System.out.println("Opção inválida.");
            }
        }

    }
}
