package dio.digitalinovation.dio.digitalinovation.oo.interfac;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void somar(double valor1, double valor2) {
        System.out.println("Soma: " + (valor1 + valor2));
    }
    @Override
    public void subtrair(double valor1, double valor2){
        System.out.println("Subtração: " + (valor1 - valor2));
    }
    @Override
    public void multiplicar(double valor1, double valor2){
        System.out.println("multiplicação: " + (valor1 * valor2));
    }
    @Override
    public void dividir(double valor1, double valor2){
        System.out.println("Dividir: " + (valor1 / valor2));
    }


}
