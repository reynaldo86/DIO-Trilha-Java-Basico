import exercicios.Calculadora;
import exercicios.Emprestimo;
import exercicios.Mensagem;
import exercicios.Sobrecarga;

public class Main {
    public static void main(String[] args) {

        //Calculadora.
        System.out.println("Exercicio calculadora");

        Calculadora.somar(5,6);
        Calculadora.subtrair(456,544);
        Calculadora.multiplicar(456,544);
        Calculadora.dividir(456d,544d);

        //Mensagem.
        System.out.println("Exercicio mensagem.");
        Mensagem.horarios(5);
        Mensagem.horarios(0);
        Mensagem.horarios(14);
        Mensagem.horarios(22);

        //Emprestimo.
        System.out.println("Exercicio Emprestimo.");
        Emprestimo.calcular(2000, 3);

        //Calcular Área.
        Sobrecarga.calcularArea(6);
        Sobrecarga.calcularArea(5,8);
        Sobrecarga.calcularArea(5,8,9);
    }
}
