package exercicios;

public class Sobrecarga {

    public static void calcularArea(double lado){
        double area = lado * lado;
        System.out.println("O quadrado tem uma área de: " +area + "m²");
    }
    public static void calcularArea(double base, double altura){
        double area = base * altura;
            System.out.println("O Retangulo tem uma área de: " + area + "m²");
        }
    public static void calcularArea(double base1, double base2, double altura){
        double area = ((base1 + base2) * altura) / 2;
        System.out.println("O trapezio tem uma área de: " +area + "m²");
    }

}
