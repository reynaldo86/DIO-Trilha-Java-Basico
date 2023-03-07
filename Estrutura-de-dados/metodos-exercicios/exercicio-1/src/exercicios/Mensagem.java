package exercicios;
/*
A partir da hora do dia, informe a mensagem de bom dia, boa tarde e boa noite.
 */

public class Mensagem {

    public static void horarios(int horas){
        if(horas >= 0 && horas < 12){
            System.out.println("Bom dia!!!");
        }
        else if (horas >= 12 && horas < 18) {
            System.out.println("Boa tarde!!!");
        }
        else if (horas >=18 && horas < 23){
            System.out.println("Boa noite!!!");
        } else if (horas < 0 || horas > 23) {
            System.out.println("Valor inválido, digite uma hora entre 0 e 23.");
        }

    }

}
