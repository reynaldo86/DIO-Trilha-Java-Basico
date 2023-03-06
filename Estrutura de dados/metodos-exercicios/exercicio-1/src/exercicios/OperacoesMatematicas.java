package exercicios;

/*
Calcula as 4 operações básicas: soma, subtração, multiplicação e divisão.
Sempre 2 valores devem ser passados.

 */
public class OperacoesMatematicas {

    private static void somar(int valor1, int valor2) {
        System.out.println(valor1 + valor2);
    }
    private static void subtrair(int valor1, int valor2) {
        System.out.println(valor1 - valor2);
    }
    private static void multiplicar(int valor1, int valor2) {
        System.out.println(valor1 * valor2);
    }
    private static void dividir(Double valor1, Double valor2) {
        if(valor1 == 0 || valor2 == 0){
            System.out.println("Nenhum valor pode ser divididos por zero");
        }else {
            System.out.println(valor1 / valor2);
        }

    }

    public static void main(String[] args) {

        somar(456,544);
        subtrair(456,544);
        multiplicar(456,544);
        dividir(456d,544d);

    }


}