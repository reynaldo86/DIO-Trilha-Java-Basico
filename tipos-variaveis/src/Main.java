public class Main {
    public static void main(String[] args) {

        //Tipos de variaveis
	
	double salarioMinimo = 2500;
	short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2= (short) numeroNormal;

        System.out.format("%.2f\n%d\n%d\n%d", salarioMinimo,numeroCurto, numeroNormal, numeroCurto2);

    }
}