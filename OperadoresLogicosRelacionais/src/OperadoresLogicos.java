public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operadores.java
        boolean condicao1=true;

        boolean condicao2=false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas
        expressões.
        É como se estivesse escrito:
         "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2) {
            System.out.println("Os dois valores precisam ser verdadeiros");

        }
        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2) {
            System.out.println("Um dos valores precisa ser verdadeiro");
        }

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;


        //And (e) &&
        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 && b3 = " + (b1 && b3));

        //Ou (or) ||
        System.out.println("b2 || b3 = " + (b2 || b3));
        System.out.println("b2 || b4 = " + (b2 || b4));

        System.out.println("b1 ^ b3 = " + (b1 ^ b3));
        System.out.println("b4 ^ b1 = " + (b4 ^ b1));

        //Negação
        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + i2) < (f2 - f1)) && true? -> " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("((i1 > i2) || (f2 < f1)) -> " + (((i1 > i2) || (f2 < f1))));

        double salarioMensal = 11893.58;
        double mediaSalario = 10500;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Recebe auxilio: " + recebeAuxilio);





    }
}
