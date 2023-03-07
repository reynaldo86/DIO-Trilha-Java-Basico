package exercicios;

public class CalculoArea {

    public static double calcularQuadrado(double lado){
        return lado * lado;
    }
    public static double calcularRetangulo(double base, double altura){
        return base * altura;
    }
    public static double calcularTrapezio(double base1, double base2, double altura){
        return ((base1 + base2) * altura) / 2;
    }
}
