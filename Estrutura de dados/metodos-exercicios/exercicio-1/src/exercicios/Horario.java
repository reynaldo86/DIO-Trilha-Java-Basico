package exercicios;
/*
A partir da hora do dia, informe a mensagem de bom dia, boa tarde e boa noite.
 */

public class Horario {

    public static void horarios(int horas){
        if(horas >= 0 || horas < 12){
            System.out.println("Bom dia!!!");
        } else if (horas >= 12 || horas < 18) {
            System.out.println("Boa tarde!!!");
        } else if (horas >=18 || horas < 23){
            System.out.println("Boa noite!!!");
        }

    }
    public static void main(String[] args) {
        horarios(5);
    }
}
